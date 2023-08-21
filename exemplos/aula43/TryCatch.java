package aula43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try {
            String[] vect = scan.nextLine().split(" ");
            int position = scan.nextInt();
            System.out.println(vect[position]);
            //porém esse programa pode dar algumas exceções
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException a){
            System.out.println("Invalid caracter!");
        }
        System.out.println("Fim do programa");

        scan.close();
    }
}
