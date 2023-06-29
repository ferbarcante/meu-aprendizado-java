package aula31;

  public class Carro {
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel);
    }
    public double obterAutonomia(){
        System.out.println("Método obter autonomia foi chamado");
        return this.capCombustivel * this.consumoCombustivel;
    }
    public double calcularCombustivel(double km){
        double qtdCombustivel = km/this.consumoCombustivel;

        return this.dividiKmPorConsumoCombustivel(km);
    }
    private double dividiKmPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }
}
