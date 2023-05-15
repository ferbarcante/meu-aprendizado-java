package aula20;

import java.util.Random;

public class Questao01 {
    public static void main(String[] args){

        int[][] valoresAleatorio = new int[4][4];

        Random numeroRandom = new Random();

        for (int i=0; i<valoresAleatorio.length; i++){
            for (int j=0; j<valoresAleatorio[i].length; j++){
                valoresAleatorio[i][j] = numeroRandom.nextInt(100);
            }
        }

        int maior = Integer.MIN_VALUE;
        int linhas = 0;
        int col = 0;

        for (int i=0; i<valoresAleatorio.length; i++){
            for (int j=0; j<valoresAleatorio[i].length; j++){
                if (valoresAleatorio[i][j] > maior){
                    maior = valoresAleatorio[i][j];
                    linhas = i;
                    col = j;
                }
            }
        }
        for (int i=0; i<valoresAleatorio.length; i++) {
            for (int j = 0; j < valoresAleatorio[i].length; j++) {
                System.out.print(valoresAleatorio[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linhas);
        System.out.println("Coluna = " + col);
    }
}
