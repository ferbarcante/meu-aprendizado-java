package aula15;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if (n1> n2 && n1>n3){
           System.out.println("O maior número é: "+ n1);
        }else if (n2>n3 && n2>n1){
            System.out.println("O maior numero é:" + n2);
        }else if (n3>n1 && n3>n2){
            System.out.println("O maior numero é:"+ n3);
        }
    }
}
