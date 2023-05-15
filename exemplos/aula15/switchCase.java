package aula15;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia da semana e diremos o nome:");
        int dia = scan.nextInt();

      /*  if (dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2){
            System.out.println("Segunda");
        }else if (dia == 3){
            System.out.println("Terça");
        }else if (dia == 4){
            System.out.println("Quarta");
        }else if (dia == 5){
            System.out.println("Quinta");
        }else if (dia == 6){
            System.out.println("Sexta");
        }else if (dia == 7){
            System.out.println("Sábado");
        }else {
            System.out.println("Nao é um dia da semana válido");
        }*/

        switch(dia){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia útil"); break;
            case 1:
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Não é um dia da semana válido");
        }
    }
}
