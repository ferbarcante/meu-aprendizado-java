package aula27;

public class Carro {
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double  capCombustivel;
    public double consumoCombustivel;

    public Carro(){
        System.out.println("Classe carro foi instanciada");
        numPassageiros = 4;
    }

    public Carro(String marca_, String modelo, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }
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
