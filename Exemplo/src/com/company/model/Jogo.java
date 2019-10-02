package com.company.model;

public class Jogo {

    // declaracao de variaveis

    public String nome, plataforma, lancamento, genero;
    public int id;

    public Jogo(String nome, String lancamento, String genero, String plataforma, int id) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.genero = genero;
        this.plataforma = plataforma;
        this.id = id;
    }

    public Jogo(){}



//    public Jogo() {
//        this.id = id;
//    }
//
//    int getId() {
//        return this.id;
//    }


    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", lancamento='" + lancamento + '\'' +
                ", genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", id=" + id +
                '}';
    }


}





