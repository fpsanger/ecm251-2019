package com.company.dao;

import com.company.model.Jogo;
import com.company.utilities.Constrains;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogoDAO {


    // comunicacao do Banco e operacoes

    private Connection conn;

    private static JogoDAO instance = null;

    public static JogoDAO getInstance(){
        if(instance == null){
            instance = new JogoDAO();
        }
        return instance;
    }

    public JogoDAO(){

        try {
            conn = DriverManager.getConnection(Constrains.kUrlBanco);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Jogo> getAll() {
        List<Jogo> jogos = new ArrayList<>();
        Jogo jogo = new Jogo();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from Jogos");
            while (rs.next()) {

                jogo.setId(rs.getInt("id"));
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


    public boolean inserirJogo(Jogo jogo){

        PreparedStatement comandoSQL; // para fazer o comando sql

        try {
            comandoSQL = conn.prepareStatement("INSERT INTO Jogos VALUES (?,?,?,?,?)");

            comandoSQL.setNull(1,Types.INTEGER);
            comandoSQL.setString(2,jogo.nome);
            comandoSQL.setString(3,jogo.lancamento);
            comandoSQL.setString(4,jogo.plataforma);
            comandoSQL.setString(5,jogo.genero);


            comandoSQL.executeUpdate();
            //conn.commit();


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

    public boolean deletarJogo() {


        PreparedStatement comandoSQL;

        Jogo jogo = new Jogo();


        try {
            comandoSQL = conn.prepareStatement("DELETE from Jogos WHERE id=? ");

            comandoSQL.setInt(1,jogo.getId());

            comandoSQL.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
