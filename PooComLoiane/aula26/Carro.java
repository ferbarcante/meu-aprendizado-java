package aula26;

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

        System.out.println("Método obterAutonomia foi chamado ");
        //o return precisa ser no final
        return capCombustivel * consumoCombustivel;
    }
}
