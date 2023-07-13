package aula28;

import aula27.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numPassageiros);

        Carro limousine = new Carro("Lincoln", "Town car", 15, 76, 20  );

        System.out.println(limousine.numPassageiros);
    }
}


