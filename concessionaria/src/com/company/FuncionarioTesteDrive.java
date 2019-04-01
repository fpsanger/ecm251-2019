package com.company;

public class FuncionarioTesteDrive {

    public static void main(String[] args) {

        Funcionarios f1 = new Funcionarios("Joao", 1000.0);


        System.out.println( f1.pegaDados() + " Salario do mes: " + f1.getSalario_mes(1000.0));
        //System.out.println( v1.pegaDados() + " Salario do mes: " + v1.getSalario_mes(1000.0));
        //System.out.println( g1.pegaDados() + " Salario do mes: " + g1.getSalario_mes(1000.0,3000.0));
    }
}




