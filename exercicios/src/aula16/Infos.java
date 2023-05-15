package aula16;

import java.util.Scanner;

public class Infos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int idade, salario;
        String nome, sexo, civil;

        boolean infoValida = false;

        do {
            System.out.println("Digite seu nome:");
            nome = scan.next();

            if (nome.length() >= 3){
                infoValida = true;
            } else {
                System.out.println("O nome precisa ter no mínimo 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite a sua idade");
            idade = scan.nextInt();

            if (idade>=0 && idade<= 150){
                infoValida = true;
            } else {
                System.out.println("A idade é inválida digite novamente");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite o seu sexo");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ){
                infoValida = true;
            } else {
                System.out.println("Sexo inválido");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu estado civil");
            civil = scan.next();

            if (civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c") || civil.equalsIgnoreCase("v") || civil.equalsIgnoreCase("d") ){
                infoValida = true;
            } else {
                System.out.println("Info inválida digite outro");
            }
        } while (!infoValida);
    }
}
