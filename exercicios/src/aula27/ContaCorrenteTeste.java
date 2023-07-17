package aula27;

import java.util.Scanner;

public class ContaCorrenteTeste {
    public static void main(String[] args){

        ContaCorrente contaNanda = new ContaCorrente();
        contaNanda.saldo = 20.3;

        boolean sacando  = contaNanda.podeSacar();
        System.out.println(sacando);



    }
}
