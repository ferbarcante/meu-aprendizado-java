package aula27;

import java.util.Scanner;

public class ContaCorrente {
    long numero;
    double saldo;
    boolean especial;
    long limite;

    public boolean podeSacar(){
        boolean podeSaque;
        if(saldo>0){
            podeSaque = true;
        } else {
            podeSaque = false;
        }

        return podeSaque;
    }

    void depositar(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de dinheiro desejada para o depósito");
        double deposito = scan.nextDouble();
    }

    double consultarSaldo(double verificarSaldo){
        verificarSaldo = saldo;

        return verificarSaldo;

    }

    void especial(){
        especial = true;
    }
    void naoEspecial(){
        especial = false;
    }

}
