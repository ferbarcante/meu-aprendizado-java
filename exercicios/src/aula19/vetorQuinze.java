package aula19;

import java.util.Scanner;

public class vetorQuinze {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.print("VetorA ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("VetorB ");
        for(int i = 0; i< vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
