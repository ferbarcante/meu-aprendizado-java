package aula16;

import java.util.Scanner;

public class Populacao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double paisB, paisA, taxaA, taxaB;
        int i = 0;
        System.out.println("Digite a população do pais A e sua taxa de crescimento anual:");
        paisA = scan.nextDouble();
        taxaA = scan.nextDouble();

        System.out.println("Digite a população do pais B e sua taxa de crescimento anual:");
        paisB = scan.nextDouble();
        taxaB = scan.nextDouble();

        boolean qtdPop = false;
        do {
            ++i;
            if (paisA<= paisB){
                paisA = (paisA * taxaA/100) + paisA;
                paisB = (paisB * taxaB/100) + paisB;
            } else if (paisA>=paisB){
                qtdPop = true;
                System.out.println(i);
            }
        } while (!qtdPop);
    }
}
