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

    public static JogoDAO getInstance() {
        if (instance == null) {
            instance = new JogoDAO();
        }
        return instance;
    }

    public JogoDAO() {

        try {
            conn = DriverManager.getConnection(Constrains.kUrlBanco);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Jogo> getAll() {
        List<Jogo> jogos = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from Jogos");
            while (rs.next()) {

                Jogo jogo = new Jogo(rs.getString("nome"),rs.getString("lancamento"),rs.getString("genero"),rs.getString("plataforma"),rs.getInt("id"));

                //jogo.id = rs.getInt("id");

                //jogo.nome = rs.getString("nome");

                //jogo.lancamento = rs.getString("lancamento");

                //jogo.genero = rs.getString("genero");

                //jogo.plataforma = rs.getString("plataforma");

                jogos.add(jogo);
            }
            rs.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return jogos;
    }


    public boolean inserirJogo(Jogo jogo) {

        PreparedStatement comandoSQL; // para fazer o comando sql

        try {
            comandoSQL = conn.prepareStatement("INSERT INTO Jogos VALUES (?,?,?,?,?)");

            comandoSQL.setNull(1, Types.INTEGER);
            comandoSQL.setString(2, jogo.nome);
            comandoSQL.setString(3, jogo.lancamento);
            comandoSQL.setString(4, jogo.plataforma);
            comandoSQL.setString(5, jogo.genero);


            comandoSQL.executeUpdate();
            //conn.commit();


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


    public void deletarJogo(int id) {


        PreparedStatement comandoSql;

        Jogo jogo = new Jogo();




        try {
            comandoSql = conn.prepareStatement("DELETE FROM Jogos WHERE id=? ");

            comandoSql.setInt(1, id);

            comandoSql.executeUpdate();

            //Statement comandoSql = conn.createStatement();
            //comandoSql.executeUpdate("DELETE FROM jogos WHERE id=" + id+";");


        } catch (SQLException e) {
            e.printStackTrace();

        }
    }


    public void updateJogo(Jogo jogo){

        PreparedStatement comandoSQL; // para fazer o comando sql

        try {
            comandoSQL = conn.prepareStatement("UPDATE Jogos SET " + "nome=\"" + jogo.nome + "\"," + "genero=\"" + jogo.genero + "\","+ "plataforma=\"" + jogo.plataforma + "\"," + "lancamento=\"" + jogo.lancamento + "\"" + " WHERE id=" + jogo.id+";");

//            comandoSQL.setNull(1, Types.INTEGER);
//            comandoSQL.setString(2, jogo.nome);
//            comandoSQL.setString(3, jogo.lancamento);
//            comandoSQL.setString(4, jogo.plataforma);
//            comandoSQL.setString(5, jogo.genero);


            comandoSQL.executeUpdate();
            //conn.commit();


        } catch (SQLException e) {
            e.printStackTrace();

        } catch (NullPointerException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }


    public List<Jogo> searchByName(String nome){

        List<Jogo> jogos = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from Jogos WHERE nome LIKE '%" + nome + "%';");
            while (rs.next()) {

                Jogo jogo = new Jogo(
                        rs.getString("nome"),
                        rs.getString("lancamento"),
                        rs.getString("genero"),
                        rs.getString("plataforma"),
                        rs.getInt("id"));

                jogos.add(jogo);

            }
            rs.close();


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return jogos;


    }

    public List<Jogo> searchByPlataform(String plataforma){

        List<Jogo> jogos = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from Jogos WHERE plataforma LIKE '%" + plataforma + "%';");
            while (rs.next()) {

                Jogo jogo = new Jogo(
                        rs.getString("nome"),
                        rs.getString("lancamento"),
                        rs.getString("genero"),
                        rs.getString("plataforma"),
                        rs.getInt("id"));

                jogos.add(jogo);

            }
            rs.close();


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return jogos;


    }

    public List<Jogo> searchByType(String genero){

        List<Jogo> jogos = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from Jogos WHERE genero LIKE '%" + genero + "%';");
            while (rs.next()) {

                Jogo jogo = new Jogo(
                        rs.getString("nome"),
                        rs.getString("lancamento"),
                        rs.getString("genero"),
                        rs.getString("plataforma"),
                        rs.getInt("id"));

                jogos.add(jogo);

            }
            rs.close();


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return jogos;


    }








}



