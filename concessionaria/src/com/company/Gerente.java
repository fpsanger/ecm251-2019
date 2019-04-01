package com.company;

public class Gerente {

    private String nome;
    private String cpf;
    private Vendedor vendedor;
    private double salario_base;
    private double porcetagemDacomissao;
    //private double porcetagemDesalario;
    private double salario_mes;
    private double totalDeVendas = 1000.0;

    public Gerente(String nome, double salario_base){

        this.nome = nome;
        this.salario_base = salario_base;
        this.porcetagemDacomissao = 0.1;
        //this.porcetagemDesalario = 0.5;

    }

    public String pegaDados(){

        return " Nome: " + this.nome + " salario_base: " + this.salario_base;
    }

    public double getSalario_mes(double totalDeVendas, double salario_base) {

        return this.salario_base + getComissao(totalDeVendas);
    }

    public double getSalario_base(){
        return this.salario_base;
    }

    public double getComissao(double totalDeVendas){
        return this.porcetagemDacomissao*totalDeVendas + 0.5*this.salario_base;
    }

    public boolean aumentoSalarioBaseVendedor(Vendedor vendedor){

        if(vendedor.getGerente().equals(this)){
            return true;
        } else {
            return false;
        }

    }
}
