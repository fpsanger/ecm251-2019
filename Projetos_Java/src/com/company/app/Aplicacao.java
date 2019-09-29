package com.company.app;

import com.company.model.Jogo;
import com.company.model.JogosDAO;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {


    private Scanner scanner;
    private List<Jogo> jogos;
    private Jogo jogo;
    JogosDAO jogosDAO ;

    private void menu(){

        System.out.println("1 - Ja cadastrados");
        System.out.println("2 - Pesquisar");
        System.out.println("3 - Inserir");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Deletar");
        System.out.println("0 - Sair");


    }

    public Aplicacao(){

        scanner = new Scanner(System.in);
        jogosDAO= new JogosDAO();
    }

    public void run(){

        boolean continuar = true;

        do {

            menu();
            int op = scanner.nextInt();
            switch (op) {

                case 0:
                    continuar = false;
                    break;

                case 1:
                    jogos=this.jogosDAO.getAll();

                    Iterator var7= this.jogos.iterator();

                    while(var7.hasNext()){
                        Jogo j= (Jogo)var7.next();
                        System.out.print("Nome: " + j.nome+"\n");
                        System.out.println("Plataforma: " + j.plataforma);
                    }

                    break;

                case 2:
                    break;

                case 3:
                    jogosDAO.insertJogo(jogo);

            }
        }while(continuar);
    }

}
