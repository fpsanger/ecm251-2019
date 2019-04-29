package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTesteDrive {

    public static void main(String[] args) {

        List<MinhaClasse> minhaLista;
        minhaLista = new ArrayList<MinhaClasse>();
        MinhaClasse minhaClasse = new MinhaClasse(10, "All Might");

        // Para adicionar objeto na lista
        minhaLista.add(minhaClasse);
        minhaLista.add(new MinhaClasse(2,"Endvour"));

        //for(MinhaClasse m : minhaLista){
            //System.out.println(m);

        //minhaClasse = minhaLista.get(1);
        }

    }


