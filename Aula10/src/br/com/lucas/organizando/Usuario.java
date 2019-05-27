package br.com.lucas.organizando;

public class Usuario {
    protected String nome;
    public Usuario(String nome){
        this.nome = nome;
    }

    public String retornaNome(){
        return this.nome;
    }
}
