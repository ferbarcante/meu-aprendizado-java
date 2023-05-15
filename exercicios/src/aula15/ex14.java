package aula15;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as notas do aluno:");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();

        double media = n1 * n2 / n1 + n2;

        if (media < 10 && media >9){
            System.out.println("Você tirou A");
        } else if (media < 9 && media > 7.5){
            System.out.println("Você tirou B");
        } else if (media > 6 && media < 7.5){
            System.out.println("Você tirou C");
        } else if (media >4 && media < 6){
            System.out.println("Você tirou D");
        } else if (media < 4 && media >=  0 ){
            System.out.println("Você tirou E");
        }
    }
}




