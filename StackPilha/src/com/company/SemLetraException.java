package com.company;

public class SemLetraException extends Exception {

    @Override
    public String getMessage(){
        return "Não existe letra B em sua frase";
    }
}
