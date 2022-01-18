package com.company;

public class TesteMetodos {

    public static void main(String[] args) {
        Conta contaDoEdu = new Conta();
        contaDoEdu.saldo=100;

        contaDoEdu.deposita(50);
        System.out.print("\n"+ contaDoEdu.saldo);


        boolean sacou = contaDoEdu.sacar(20);
        System.out.print("\n"+ contaDoEdu.saldo);
        System.out.print("\n"+ sacou);

        Conta contadaPalmoa = new Conta();
        contadaPalmoa.deposita(1000);

        boolean sucessoTransferencia = contadaPalmoa.transfere(300, contaDoEdu);

        if (sucessoTransferencia){
            System.out.print("\n Transferencia com sucesso");
        }else{
            System.out.print("\n Faltou dinheiro");
        }
        System.out.print("\n"+ contaDoEdu.saldo);
        System.out.print("\n"+ contadaPalmoa.saldo);
    }
}

