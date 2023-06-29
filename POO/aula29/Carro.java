package aula29;

public class Carro {
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double  capCombustivel;
    public double consumoCombustivel;

    Carro(){
        System.out.println("Classe carro foi instanciada");
        numPassageiros = 10;
    }

    public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
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
