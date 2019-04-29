package com.company;

public class Main {

    public static void main(String[] args) {

       Animal[] animals = new Animal[3]; // nao tem nenhum animal ainda, só a referencia que terá um animal
        animals[0] = new Lobo();
        animals[1] = new Lobo();
        animals[2] = new Lobo();



       // animals[3].comer(); // Nao definido nada na posicao 1, retorna NULL.Pointer

        //for(int i = 0; i<animals.length; i++){
            //animals[i].comer();
        //}

        for(Animal animal : animals){
            animal.comer();
        }
    }

}
