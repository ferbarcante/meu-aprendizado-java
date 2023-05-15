package aula13;

import java.util.Scanner;

public class metroParaCentimetros {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os metros: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;
        System.out.println("Em cm fica: " + centimetros);
    }
}
