package aula16;

import java.util.Scanner;

public class SenhaNome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean senhaValida = false;
        System.out.println("Digite seu nome");
        String nome = scan.next();

        do {
            System.out.println("Digite sua senha");
            String senha = scan.next();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Senha inválida, digite outra");
            } else {
                senhaValida = true;
                System.out.println("Senha válida");
            }
        } while (!senhaValida);
    }
}
