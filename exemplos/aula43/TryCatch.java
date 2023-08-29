package aula43;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args){
        
        method1();

        System.out.println("Fim do programa");

    }
    
    public static void method1() {
    	System.out.println("==== METHOD1 START ====");
    	
    	method2();
    
    	System.out.println("==== METHOD1 ENDS ====");

    }
    
    public static void method2() {
    	
    	System.out.println("==== METHOD2 START ====");
    	
    	Scanner scan = new Scanner(System.in);
    	
    	  try {
              String[] vect = scan.nextLine().split(" ");
              int position = scan.nextInt();
              System.out.println(vect[position]);
          }
          catch (ArrayIndexOutOfBoundsException e){
              System.out.println("Invalid position!");
              e.printStackTrace();
              //imprime o tipo da exceção e a sequencia de chamadas que gerou
          }
          catch (InputMismatchException a){
              System.out.println("Invalid caracter!");
          }
    	  
    	  System.out.println("==== METHOD2 ENDS ====");
    	  scan.close();
    }
}
