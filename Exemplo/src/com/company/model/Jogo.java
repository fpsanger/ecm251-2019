package com.company.model;

public class Jogo {

    // declaracao de variaveis

    public String nome,plataforma,lancamento,genero;
    private int id;


    public Jogo(int id){
        this.id = -1;
    }


    public Jogo(){
        this.id = id;
    }


    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
