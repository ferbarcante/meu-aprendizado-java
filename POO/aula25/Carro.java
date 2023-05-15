package aula25;

public class Carro {
    String marca;
    String modelo;
    int numPassageitos;
    double  capCombustivel;
    double consumoCombustivel;

    //sem retorno usa void
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }
}
