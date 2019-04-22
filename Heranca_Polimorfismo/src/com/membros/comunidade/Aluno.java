package com.membros.comunidade;

public class Aluno extends MembrosDaComunidade {

    private String RA;

    public Aluno(String nome, String cpf, String RA){
        super(nome,cpf);
        this.RA = RA;
    }

    @Override
    public String getDados(){
        return super.getDados()+ '\t' + RA;
    }

}
