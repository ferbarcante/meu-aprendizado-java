package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        File file = new File("\\home\\fefe\\Documentos\\file1.xt");
        Scanner scan = null;
        System.out.println(file.canExecute());
        try{
            scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (IOException e){
            System.out.println("Error " + e.getMessage());
        } finally {
            if(scan != null) {
                scan.close();
            }
        }
    }
}
