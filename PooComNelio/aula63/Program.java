package aula63;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        String maior = "a";

        System.out.println("Enter the measures of entities.triangle X: ");
        xA = scan.nextDouble();
        xB = scan.nextDouble();
        xC = scan.nextDouble();

        System.out.println("Enter the measures of entities.triangle Y:");
        yA = scan.nextDouble();
        yB = scan.nextDouble();
        yC = scan.nextDouble();

        double p = (xA + xB + xC)/2;
        double areaX = Math.sqrt(p * (p-xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC)/2;
        double areaY = Math.sqrt(p * (p-yA) * (p - yB) * (p - yC));

        if (areaY > areaX){
            maior = "Y";
        } else if (areaY == areaX) {
            maior = "both";
        } else if (areaX > areaY){
            maior = "X";
        }

        System.out.println("Area of entities.triangle X: " + areaX);
        System.out.println("Area of entities.triangle Y: " + areaY);
        System.out.println("Larger area: " + maior);



    }
}
