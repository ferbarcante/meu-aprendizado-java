package aula27;

public class TesteLampada {
    public static void main(String [] args){
        Lampada lampada = new Lampada();

        lampada.desligar();

        if (lampada.ligada) {
            System.out.println("Lampada está ligada ");

        } else {
            lampada.desligar();
            System.out.println("Lampada está desligada");
        }
    }
}
