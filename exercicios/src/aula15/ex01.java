package aula15;

import java.util.Scanner;

public class ex01 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        if (n1>n2){
            System.out.println(n1);
        }else {
            System.out.println(n2);
        }


    }
}
