package aula16;

import java.util.Scanner;

public class NotaValor {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    boolean notaValida = false;
    do {
        System.out.println("Digite uma nota entre zero e dez");
        int nota = scan.nextInt();

        if (nota >= 0 && nota <= 10) {
             notaValida = true;
            System.out.println("Voce digitou: " + nota);
        } else {
             notaValida = false;
            System.out.println("Nota inválida, digite novamente.");
        }
    } while (!notaValida);

    }
}
