package com.company;

public class Conta{

    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor){
        this.saldo += saldo + valor;

    }

    public boolean sacar (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }

    }
}

