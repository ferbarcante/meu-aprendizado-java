package aula27;

import aula27.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new aula27.Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        //chamando o método
        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);

        double qtdCombustivel = van.consumoKm(10);
        System.out.println("comsumokm: " + qtdCombustivel);
    }
}
