package aula30;

public class Carro {
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double  capCombustivel;
    public double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel,
                 double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
    public Carro(String marca, String modelo){
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com 2 parametros");
    }
    public Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parametros");

    }
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel);
    }
    double obterAutonomia(){
        System.out.println("Método obter autonomia foi chamado");
        return this.capCombustivel * this.consumoCombustivel;
    }
    double calcularCombustivel(double km){
        double qtdCombustivel = km/this.consumoCombustivel;

        return qtdCombustivel;
    }
}
