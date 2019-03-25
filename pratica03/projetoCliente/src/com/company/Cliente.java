package com.company;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Cliente {

    private String nome;
    private String ra;
    private boolean funcionario;
    private boolean visitante;



    public void Comprar(){

        Produto p1;



    }

    public void Acompanhar(){

        Cliente c1;


    }


    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public boolean isFuncioanrio() {
        return funcionario;
    }

    public boolean isVisitante() {
        return visitante;
    }

    public Cliente(String nome){
        this.nome = nome;
        this.visitante = true;

    }

    public Cliente(String nome, boolean funcionario){
        this.nome = nome;
        if(funcionario)
            this.funcionario = funcionario;
        else
            visitante = true;
    }

    public Cliente(String nome, String ra){
        this.nome = nome;
        this.ra = ra;

    }

}
