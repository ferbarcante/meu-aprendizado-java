package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program02 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Set<IdAluno> aluno = new HashSet<>();

        System.out.println("How many students for course A?");
        int qtd = scan.nextInt();

        for (int i = 0; i < qtd; i++){
            int id = scan.nextInt();
            aluno.add(new IdAluno(id));
        }

        System.out.println("How many students for course B?");
        qtd = scan.nextInt();

        for (int i = 0; i < qtd; i++){
            int id = scan.nextInt();
            aluno.add(new IdAluno(id));
        }

        System.out.println("How many students for course C?");
        qtd = scan.nextInt();

        for (int i = 0; i < qtd; i++){
            int id = scan.nextInt();
            aluno.add(new IdAluno(id));
        }

        System.out.println("Total students: " + aluno.size());
    }
}
