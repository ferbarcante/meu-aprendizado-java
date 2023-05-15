package aula15;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os três lados do triangulo:");
        int lado1 = scan.nextInt();
        int lado2 = scan.nextInt();
        int lado3 = scan.nextInt();

        if (lado1 == lado2 && lado3 == lado2){
            System.out.println("É equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("Isóceles");
        } else if (lado1 != lado2 && lado2 != lado3 ){
            System.out.println("Escaleno");
        }
    }
}
