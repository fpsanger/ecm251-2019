package com.company;
import personagens.Cliente;

public class Main {

    public static void main(String[] args) {

//        Cliente c1 = new Cliente("Teste 1");
//        System.out.println(c1);
//
//        personagens.Cliente c2;
//        c2 = new personagens.Cliente("Teste 2");
//        System.out.println(c2);

//        java.util.Date d1;
//        java.util.GregorianCalendar d2;
//        java.text.SimpleDateFormat d3;

    //Comportamento perigoso
        // Pacote da Classe
        Cliente c1 = new Cliente("c1");
        Cliente c2 = new Cliente("c2");
        System.out.println(c1);
        System.out.println(c2);



    }
}


// variavel protected, tem visibilidade do pacote, é como se fosse público
// 4 pilares de AO: abstracao, encapsulamento, herança, polimorfismo
