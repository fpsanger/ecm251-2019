package com.company;

public class Conta {

    int numero;
    String titular;
    double saldo;
    String cpf;

    public void visualizarSaldo(){

        System.out.println("Conta: " + numero + " com saldo disponivel: " + saldo);

    }

    public void depositar(double valorParaDepositar){ // ideal que seja boolean, para ver se a operacao deu certo

        saldo += valorParaDepositar;

    }

    public void sacar(double valorParaSacar){

        saldo -= valorParaSacar;

    }

    public void transferirDinheiro(double valor, Conta beneficiado){ // ideal que seja boolean, para ver se a operacao deu certo

      sacar(valor);
      beneficiado.depositar(valor);

    }



}
