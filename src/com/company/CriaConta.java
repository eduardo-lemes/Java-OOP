package com.company;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.print(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.print(primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        segundaConta.saldo = 50;

        System.out.println("\nprimeira conta tem " + primeiraConta.saldo);
        System.out.println("\nsegunda conta tem " + segundaConta.saldo);

        System.out.println(primeiraConta);
    }
}
