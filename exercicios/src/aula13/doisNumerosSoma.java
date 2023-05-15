package aula13;

import java.util.Scanner;

public class doisNumerosSoma {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

            System.out.println("Digite dois numeros: ");
            int numero1 = scan.nextInt();
            int numero2 = scan.nextInt();
            System.out.println("A soma dos dois numeros é: " + (numero1 + numero2));

    }
}
