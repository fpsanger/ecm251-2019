package com.company;

public class Funcionarios {

    private String nome;
    private String cpf;
    private double salario_base;
    private double porcetagemDacomissao;
    private double salario_mes;
    private double totalDeVendas = 1000.0;

    public Funcionarios(String nome, double salario_base){

        this.nome = nome;
        this.salario_base = salario_base;
        this.porcetagemDacomissao = 0.05;

    }

    public String pegaDados(){

        return " Nome: " + this.nome + " salario_base: " + this.salario_base;
    }

    public double getSalario_mes(double totalDeVendas) {

        return this.salario_base + this.porcetagemDacomissao*totalDeVendas;
    }

    public double getSalario_base(){
        return this.salario_base;
    }

    public double getComissao(double totalDeVendas){
        return this.porcetagemDacomissao*totalDeVendas;
    }
}
