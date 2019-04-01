package com.company;

public class Conta {
    private double saldo;
    private int numeroConta;
    private String nome;

    private static int totalDeContas = 0;

    public String pegaDados(){
        return "Saldo: " + this.saldo + " Numero: " + this.numeroConta + " Nome: " + this.nome;
    }

    public Conta(String nome, double saldo){  // construtor
        this.nome = nome;
        this.saldo = saldo;
        //this.numeroConta ++; // assim, como temos as copias dos atributos do objeto(nao da classe), ambas as contas serao 1.
        this.numeroConta = Conta.totalDeContas;
        Conta.totalDeContas++; // Não é do objeto mais, e sim da Classe Conta
    }

   // public int getTotalDeContas(){ // metedo da instancia
        //return Conta.totalDeContas

   // }

    public static int getTotalDeContas() { // metedo da Classe
        return Conta.totalDeContas;
    }
}
