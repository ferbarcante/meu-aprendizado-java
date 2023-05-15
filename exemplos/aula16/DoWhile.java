package aula16;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 1;
        //O i é muito usaado para fazer contagens
        int max;
        max = scan.nextInt();
        //Valor máximo que queremos contar

        System.out.println("Contando até " + max);

        while (i <= max){
            System.out.println("O valor de i: " + i);
            i++; //mesma coisa que i = i + 1;

        }
        System.out.println(i);

        do {
            i++;
            System.out.println(i);
        } while (i < 15);
        //O do realiza a expressão primeiro e só depois avalia a expressão

        System.out.println(i);
    }
}
