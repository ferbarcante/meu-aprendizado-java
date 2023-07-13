package vetores.vetorclasse.application;

import vetores.vetorclasse.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = scan.nextInt();

        Product[] vect = new Product[n];

        for(int i = 0; i<n; i++){
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for(int i = 0; i<n; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum/n;

        System.out.println("AVARAGE PRICE: " + avg);
    }
}
