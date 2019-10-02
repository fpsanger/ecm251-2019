package com.company.app;

import com.company.dao.JogoDAO;
import com.company.model.Jogo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

    //logica do programa

    JogoDAO jogosDAO = new JogoDAO();
    List<Jogo> jogos = new ArrayList<>();
    Jogo j = new Jogo();
    Scanner scanner = new Scanner(System.in);


    public Aplicacao() {

    }

    public void menu() {

        System.out.println("1 - Ja cadastrados");
        System.out.println("2 - Inserir ");
        System.out.println("3 - Pesquisar por nome");
        System.out.println("4 - Pesquisar por plataforma");
        System.out.println("5 - Pesquisar por genero");
        System.out.println("6 - Atualizar");
        System.out.println("7 - Deletar");
        System.out.println("0 - Sair");
    }


    public void run() {


        boolean continuar = true;

        do {
            menu();
            int op = scanner.nextInt();

            switch (op) {

                case 0:
                    continuar = false;
                    break;

                case 1:
                    jogos = jogosDAO.getAll();
                    exibirJogos();

                    break;


                case 2:

                    boolean msg;

                    System.out.println("Digite o nome do jogo: ");
                    j.nome = scanner.next();

                    System.out.println("Digite o nome da plataforma: ");
                    j.plataforma = scanner.next();

                    System.out.println("Digite o nome do genero: ");
                    j.genero = scanner.next();

                    System.out.println("Digite o nome do lancamento: ");
                    j.lancamento = scanner.next();

                    msg = jogosDAO.inserirJogo(j);

                    if (msg == true) {

                        System.out.println("Inserido com sucesso");
                    } else {
                        System.out.println("Houve um erro na insercao");
                    }


                    break;

                case 3:

                    System.out.println("Digite o nome que deseja buscar: ");
                    j.nome = scanner.next();

                    jogos = jogosDAO.searchByName(j.nome);

                    exibirJogos();

                    break;


                case 4:
                    System.out.println("Digite a plataforma que deseja buscar: ");
                    j.plataforma = scanner.next();

                    jogos = jogosDAO.searchByPlataform(j.plataforma);

                    exibirJogos();

                    break;

                case 5:

                    System.out.println("Digite o genero que deseja buscar: ");
                    j.genero = scanner.next();

                   jogos =  jogosDAO.searchByType(j.genero);

                    exibirJogos();



                    break;

                case 6:
                    System.out.println("Digite o ID do jogo que deseja atualizar: ");
                    j.id = scanner.nextInt();

                    System.out.println("Digite o nome do jogo: ");
                    j.nome = scanner.next();

                    System.out.println("Digite o nome da plataforma: ");
                    j.plataforma = scanner.next();

                    System.out.println("Digite o nome do genero: ");
                    j.genero = scanner.next();

                    System.out.println("Digite o nome do lancamento: ");
                    j.lancamento = scanner.next();

                    jogosDAO.updateJogo(j);


                    break;


                case 7:
                    System.out.println("Digite o id do jogo para deletar: ");
                    j.id = scanner.nextInt();

                    jogosDAO.deletarJogo(j.id);



                    break;


            }


        } while (continuar);
    }


        private void exibirJogos () {
            for (Jogo jogo : jogos) {
                System.out.println(jogo);
            }
        }

}



