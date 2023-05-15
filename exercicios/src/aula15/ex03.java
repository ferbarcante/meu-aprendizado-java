package aula15;

import java.util.Scanner;
public class ex03 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu sexo (F ou M)");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f")){
            System.out.println("Feminino");
        } else if (sexo.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        }else {
            System.out.println("Não binário");
        }
    }
}