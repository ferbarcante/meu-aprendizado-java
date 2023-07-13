package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int n = scan.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i<vect.length; i++){
            System.out.println("Digite a altura: ");
            vect[i] = scan.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i<n; i++){
            sum += vect[i];
        }
        double avg = sum/n;

        System.out.printf("AVARAGE HEIGHT: " + avg);
    }
}
