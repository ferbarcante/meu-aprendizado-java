package aula14;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

       /* System.out.println("Entre com sua idade:");
        int idade = scan.nextInt();

        if (idade>=18) {
            System.out.println("Voce é maior de idade!");
        }else {
            System.out.println("Voce nao é maior de idade!");
        }

        */
       // barato <=10
       //10 < valor < 15  - pedir desconto
        //15<=17 - pesquisar mais
        //>= 17 - muito caro

        System.out.println("Digite o valor do produto:");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato");
        } else if (valor > 10 && valor < 15) {
                System.out.println("Pedir desconto");
        } else if (valor >= 15 && valor < 17){
                System.out.println("Pesquise mais!");
        } else if (valor >= 17) {
            System.out.println("Muito caro!!!");
        }
        }
}
