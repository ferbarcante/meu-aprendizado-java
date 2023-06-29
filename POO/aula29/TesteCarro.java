package aula29;

public class TesteCarro {
    public static void main(String[] args){

        Carro van = new Carro();
        /*
        É a mesma coisa de:
        Carro(){

        }
        */
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numPassageiros);

        Carro van2 = new Carro("Fiat", "Uno", 6, 100, 0.2);
        System.out.println(van2.modelo);
        System.out.println(van2.marca);

    }
}
