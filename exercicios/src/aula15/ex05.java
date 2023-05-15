package aula15;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as duas notas parciais do aluno:");
        int nota1 = scan.nextInt();
        int nota2 = scan.nextInt();

        int media = (nota1 + nota2)/2;
        if (media>=7){
            System.out.println("Aprovado");
        }else if (media < 7){
            System.out.println("Reprovado");
        } else if (media==10){
            System.out.println("Aprovado com Distinção");
        }
    }
}
