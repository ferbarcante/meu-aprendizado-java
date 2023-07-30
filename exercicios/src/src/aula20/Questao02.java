package src.aula20;

import java.util.Random;

public class Questao02 {
    public static void main(String[] args) {

        int[][] valoresAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for(int i = 0; i<valoresAleatorios.length; i++){
            for(int j = 0; j< valoresAleatorios.length; j++){
                valoresAleatorios[i][j] = numeroRandom.nextInt(9);
            }
        }

        int maiorL5 = Integer.MIN_VALUE;
        int menorL5 = Integer.MAX_VALUE;
        int linha5 = 5;

        for(int i = 0; i< valoresAleatorios.length; i++){
            for(int j = 0; j<valoresAleatorios.length; j++){
                System.out.print(valoresAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i< valoresAleatorios[linha5].length; i++) {
            if(valoresAleatorios[linha5][i] > maiorL5){
                maiorL5 = valoresAleatorios[linha5][i];
            }
            if(valoresAleatorios[linha5][i] < menorL5){
                menorL5 = valoresAleatorios[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5: " + maiorL5);
        System.out.println("Menor valor da linha 5: " + menorL5);

        int maiorC9 = Integer.MIN_VALUE;
        int menorC9 = Integer.MAX_VALUE;

        for(int i = 0; i < valoresAleatorios[9].length; i++){
            if(valoresAleatorios[i][9] > maiorC9){
                maiorC9 = valoresAleatorios[i][9];
            }
            if(valoresAleatorios[i][9] < menorC9){
                menorC9 = valoresAleatorios[i][9];
            }
        }
        System.out.println("Maior valor da coluna 9: " + maiorC9);
        System.out.println("Menor valor da coluna 9: " + menorC9);
    }
}
