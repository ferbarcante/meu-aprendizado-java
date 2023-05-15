package aula21;

import java.util.Random;

public class OutroEach {
    public static void main(String[] args){

        int[] notas = new int[10];

        //setar números randomicos pro array
        Random random = new Random();

        for (int i = 0; i<notas.length; i++){

            notas[i] = random.nextInt(10);
        }

        //A parte acima cria um array e define numeros de 0 a 10 nele

        //Agora iremos imprimir o array:
        for (int i = 0; i< notas.length; i++){
            int nota = notas[i];
            System.out.println(nota);
        }

        //For Each:
        System.out.println("Usando o for each");
        for(int nota : notas){
            System.out.println(nota);
        }
    }
}
