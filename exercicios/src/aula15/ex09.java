package aula15;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 3 números:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if (n1>n2 && n1>n3 && n2>n3){
            System.out.println("Primeiro: " + n1 + "Segundo: "+ n2+ "Terceiro: "+ n3);
        } else if (n1>n2 && n1>n3 && n3>n2){
            System.out.println("Primeiro" + n1+ "Segundo:" + n3 + "Terceiro"+ n2);
        } else if (n2>n1 && n2>n3 && n3>n1){
            System.out.println("Primeiro: "+ n2 + "Segundo:"+ n3 +"Terceiro: "+ n1);
        } else if (n2>n1 && n2>n3 && n1>n3){
            System.out.println("Primeiro: "+ n2 +"Segundo: "+ n1 + "Terceiro: "+ n3);
        }else if (n3>n1 && n3>n2 && n1>n2){
            System.out.println("Primeiro: "+ n3 +"Segundo: "+ n1 +"Terceiro: " + n2);
        }else if (n3>n1 && n3>n2 && n2>n1){
            System.out.println("Primeiro: "+n3 + "Segundo: "+ n2 +"Terceiro: "+ n1);
        }
    }
}
