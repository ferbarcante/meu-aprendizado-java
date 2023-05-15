package aula27;

public class Carro {
    String marca;
    String modelo;
    int numPassageitos;
    double  capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia(){
        System.out.println("Método foi chamado");

        return capCombustivel*consumoCombustivel;
    }
    //Colocamos um parametro no método quando precisa de uma informação que não se tem na classe
    double consumoKm(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}
