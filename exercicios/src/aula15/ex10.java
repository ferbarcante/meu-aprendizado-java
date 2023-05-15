package aula15;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno em que você estuda");
        System.out.println("V - Vespertino M - Matutino N - Noturno");

        String turno = scan.next();

        if (turno.equalsIgnoreCase("V")){
            System.out.println("Boa Tarde!");
        }else if (turno.equalsIgnoreCase("M")){
            System.out.println("Bom Dia!");
        }else if (turno.equalsIgnoreCase("N")){
            System.out.println("Boa Noite!");
        }
    }
}
