package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("inicio main");
        metodo1();
        System.out.println("fim main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        try{
            metodo2();
        }
        catch (Exception e){
            System.out.println("Excecao pega no metodo 1");
            System.out.println(e);
        }
        finally {
            System.out.println("depois do try catch metodo 1");
        }
        System.out.println("fim do metodo1");
    }

    static void metodo2() throws ArrayIndexOutOfBoundsException {
        System.out.println("inicio do metdod2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Algo deu errado");
            System.out.println(e);
            throw (e);
        }
        finally {
            System.out.println("Depois do try catch matodo 2");
        }
        System.out.println("fim metodo2");
    }

//    static void metodo2() {
//        System.out.println("inicio do metdod2");
//        int[] array = new int[10];
//        for (int i = 0; i <= 15; i++) {
//
//            try {
//                array[i] = i;
//            }
//            catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Algo deu errado");
//                System.out.println(e);
//            }
//            System.out.println(i);
//        }
//        System.out.println("fim metodo2");
//    }


//    static void metodo2() {
//        System.out.println("inicio do metdod2");
//        int[] array = new int[10];
//        for (int i = 0; i <= 15; i++) {
//            array[i] = i;
//            System.out.println(i);
//        }
//        System.out.println("fim metodo2");
//    }
}

