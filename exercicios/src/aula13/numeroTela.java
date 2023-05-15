package aula13;

import java.util.Scanner;
public class numeroTela {

    public static void main(String args[]){
        System.out.println("Digite um numero: ");

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        System.out.println("O numero digitado foi: " + numero);

    }
}
