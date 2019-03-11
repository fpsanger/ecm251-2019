package com.company;

import java.util.Scanner;

public class MeuCadastro {
    public static void main(String[] args) {
        int idade;
        double salario;
        String nome;
        String funcao;

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while(continuar) {
            System.out.println("Informe seu nome:");
            nome = scanner.nextLine();
            System.out.println(nome);

            System.out.println("Informe sua funcao:");
            funcao = scanner.nextLine();
            System.out.println(funcao);

            System.out.println("Informe seu salario:");
            salario = scanner.nextDouble();
            System.out.println("Valor digitado:" + salario);

            System.out.println("Informe sua idade:");
            idade = scanner.nextInt();
            System.out.println("Valor digitado:" + idade);

            System.out.printf(
                    "Nome: %s \nFunção: %s\nIdade: %d\nSalário: %.2f",
                    nome, // Nome do usuario
                    funcao, // Funcao do usuario
                    idade, // Idade do usuario
                    salario // Salario do usuario
            );
            String resposta;
            System.out.println("Deseja continuar?");
            resposta = scanner.next();
            if(resposta.equalsIgnoreCase("SIM"))
                continuar = true;
            else
                continuar = false;
        }



    }
}
