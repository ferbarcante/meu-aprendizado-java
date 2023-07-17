package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scan.nextInt();

        double[] numeros = new double[n];

        for(int i = 0; i<numeros.length; i++){
            System.out.println("Digite um número: ");
            numeros[i] = scan.nextDouble();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }

    }
}
