package aula21;

public class ForEach {
    public static void main(String[] args){

        /* Para mostrarmos os valores em cada indice do array usamos:
        *
        * int[] notas = new int[10];
        * for (int i=0; i<notas.length; i++){
        *   System.out.println(notas[i]); */

        //O for each é similar mas é como se estivessemos criando uma variável para receber aquela posição do array

        int[] notas = new int[10];

        for (int nota : notas){
            System.out.println(nota);
        }
    }




}
