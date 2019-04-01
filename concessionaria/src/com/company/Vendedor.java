package com.company;

public class Vendedor {

    private String vendedor;
    private Gerente gerente;
    private String cpf;
    private double salario_base;
    private double porcetagemDacomissao;
    private double salario_mes;
    private double totalDeVendas = 1000.0;

    public Vendedor(String vendedor, double salario_base, Gerente gerente){

        this.vendedor = vendedor;
        this.gerente = gerente;
        this.salario_base = salario_base;
        this.porcetagemDacomissao = 0.05;

    }

    public Gerente getGerente(){
        return gerente;
    }

    public String pegaDados(){

        return " Nome: " + this.vendedor + " salario_base: " + this.salario_base + " Nome gerente: " + this.gerente;
    }

    public double getComissao(double totalDeVendas) {

        return this.porcetagemDacomissao*totalDeVendas;
    }



}
