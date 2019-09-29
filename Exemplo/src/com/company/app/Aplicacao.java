package com.company.app;

import com.company.dao.JogoDAO;
import com.company.model.Jogo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

    //logica do programa

    JogoDAO  jogosDAO= new JogoDAO();
    Jogo j = new Jogo();
    Scanner scanner = new Scanner(System.in);





    public Aplicacao(){

    }

    public void menu(){

        System.out.println("1 - Ja cadastrados");
        System.out.println("2 - Pesquisar");
        System.out.println("3 - Inserir");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Deletar");
        System.out.println("0 - Sair");
    }


    public void run(){

        boolean continuar = true;

        do{
            menu();
            int op = scanner.nextInt();

            switch (op){

                case 0:
                    continuar = false;
                    break;

                case 1:
                    List<Jogo> jogos = new ArrayList<>();
                    jogos = jogosDAO.getAll();

                    Iterator var7= jogos.iterator();

                    while(var7.hasNext()){
                        Jogo j= (Jogo)var7.next();
                        System.out.println("ID:" + j.getId()+ "\n" );
                        System.out.print("Nome: " + j.nome+"\n");
                        System.out.println("Plataforma: " + j.plataforma+"\n");
                        System.out.println("Genero: " + j.genero+"\n");
                        System.out.println("Lancamento: " + j.lancamento+"\n");
                    }

                case 2:
                    break;

                case 3:

                    boolean msg;

                    System.out.println("Digite o nome do jogo: ");
                    j.nome = scanner.next();

                    System.out.println("Digite o nome da plataforma: ");
                    j.plataforma = scanner.next();

                    System.out.println("Digite o nome do genero: ");
                    j.genero = scanner.next();

                    System.out.println("Digite o nome do lancamento: ");
                    j.lancamento = scanner.next();

                    msg=jogosDAO.inserirJogo(j);

                    if(msg==true){

                        System.out.println("Inserido com sucesso");
                    }else{
                        System.out.println("Houve um erro na insercao");
                    }

                    break;

                case 4:
                    break;

                case 5:

                    System.out.println("Digite o id do jogo para deletar: ");
                    j.nome = scanner.next();

                    jogosDAO.deletarJogo();



                    break;






            }


        }while(continuar);




    }

}
