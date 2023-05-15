package aula13;

import java.util.Scanner;

public class notasBimestrais {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Digite as 4 notas bimestrais do aluno: ");
         int notaA = scan.nextInt();
         int notaB = scan.nextInt();
         int notaC = scan.nextInt();
         int notaD = scan.nextInt();


         int operacao = (notaA + notaB + notaC + notaD)/4;
         System.out.println("A nota foi: " + operacao);
    }
}
