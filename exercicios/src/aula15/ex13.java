package aula15;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("    Digite um número");
        System.out.println("    1 - Domingo");
        System.out.println("    2 - Segunda ");
        System.out.println("    3 - Terça ");
        System.out.println("    4 - Quarta ");
        System.out.println("    5 - Quinta ");
        System.out.println("    6 - Sexta ");
        System.out.println("    7 - Sábado ");
        System.out.println("-----------------------");

        String dia = scan.next();

        switch (dia){
            case "1": System.out.println("Domingo"); break;
            case "2": System.out.println("Segunda"); break;
            case "3": System.out.println("Terça"); break;
            case "4": System.out.println("Quarta"); break;
            case "5": System.out.println("Quinta"); break;
            case "6": System.out.println("Sexta"); break;
            case "7": System.out.println("Sábado"); break;
            default: System.out.println("Dia inválido");
        }


    }
}
