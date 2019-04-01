package com.company;

public class Conta {
    private double saldo;
    private int numeroConta;
    private String nome;

    public String pegaDados(){
        return "Saldo: " + this.saldo + "Numero: " + this.numeroConta + "Nome: " + this.nome;
    }
}
