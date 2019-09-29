package com.company.model;

import com.company.utilities.Constrains;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogosDAO {

    private Connection conn;

    private static JogosDAO instance = null;

    public static JogosDAO getInstance(){
        if(instance == null){
            instance = new JogosDAO();
        }
        return instance;
    }

    public JogosDAO(){

        try {
            conn = DriverManager.getConnection(Constrains.kUrlBanco);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean insertJogo(Jogo jogo){

        PreparedStatement comandoSQL;
        try {
            comandoSQL = conn.prepareStatement("INSERT INTO Jogos" + " VALUES(?,?,?,?,?);");
            comandoSQL.setNull(1, Types.INTEGER);
            comandoSQL.setString(2, jogo.nome);
            comandoSQL.setString(3, jogo.lancamento);
            comandoSQL.setString(4, jogo.genero);
            comandoSQL.setString(5, jogo.plataforma);


            comandoSQL.executeUpdate();
            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (NullPointerException e){
            e.printStackTrace();
            return false;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Jogo> getAll() {
        List<Jogo> jogos = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from Jogos");
            while (rs.next()) {
                Jogo jogo = new Jogo(rs.getInt("id"));
                jogo.nome = rs.getString("nome");
                jogo.lancamento = rs.getString("lancamento");
                jogo.genero = rs.getString("genero");
                jogo.plataforma = rs.getString("plataforma");
                jogos.add(jogo);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return jogos;
    }



}
