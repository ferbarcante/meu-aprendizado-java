package aula15;

import java.util.Scanner;

public class ex02 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scan.nextInt();

        if (n>=0){
            System.out.println("Positivo");
        } else if (n<0){
            System.out.println("Negativo");
        }
    }
}