package exe1;

import exe1.ListaDeCompras;
import exe1.Produto;

import java.util.Scanner;

public class ListaDeProdutosTestDrive {
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();
//        Scanner scanner = new Scanner(System.in);
//        for(int i = 0; i < 3; i++){
//            String nome = scanner.next();
//            if(listaDeCompras.AdicionarProduto(
//                    new Produto(nome)
//            )) {
//                System.out.println("Produto Adicionado");
//            } else {
//                System.out.println("Erro");
//            }
//        }
        listaDeCompras.AdicionarProduto(new Produto("A"));
        listaDeCompras.AdicionarProduto(new Produto("B"));
        if(listaDeCompras.Remover("A"))
            System.out.println("Removido com Sucesso!");
        if(listaDeCompras.Remover("c"))
            System.out.println("Removido com Sucesso!");
        else
            System.out.println("Erro ao remover!");
    }
}
