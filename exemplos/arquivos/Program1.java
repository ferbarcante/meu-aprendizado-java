package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program1 {
    public static void main(String[] args){

        String path = "";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e){
            System.out.println("Error " + e.getMessage());

        }
    }
}
