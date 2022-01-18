package com.company;

public class TesteMetodos {

    public static void main(String[] args) {
        Conta contaDoEdu = new Conta();
        contaDoEdu.saldo=100;

        contaDoEdu.deposita(50);
        System.out.print(contaDoEdu.saldo);


        boolean sacou = contaDoEdu.sacar(20);
        System.out.print(contaDoEdu.saldo);
        System.out.print(sacou);
    }
}

