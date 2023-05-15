package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         /*//Ler uma linha inteira:
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Mas que nome lindo, " + nomeCompleto);

       //Ler tipo de dado especifico
        System.out.println("Digite o primeiro nome do seu cachorro:");
        String nomeCachorro = scan.next();
        System.out.println("Que nome é fofo, " + nomeCachorro + " deve ser um pet amavel!");

        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println("A sua idade é: " + idade);

        System.out.println("Digite sua atltura:");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura); */

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimação");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        double altura = scan.nextDouble();
        boolean temAnimal = scan.hasNextBoolean();

        System.out.println("Voce digitou os seguintes valores: " );
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Quantidade de filhos " + qtdFilhos);
        System.out.println("Sua altura: " + altura);
        System.out.println("Tem animal de estimação? " + temAnimal);

    }
}
