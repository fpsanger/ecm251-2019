package com.membros.comunidade;

public class Main {

   static void mostrarDados(MembrosDaComunidade mdc){
        System.out.println(mdc.getDados());
    }

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Joao","12345","145678");
        mostrarDados(a1);

        Graduado g1 = new Graduado("Jose","2","Eng. Computacao");
        mostrarDados(g1);

        Professor p1 = new Professor("Kleber","12334","Matematica");
        mostrarDados(p1);
    }

}

