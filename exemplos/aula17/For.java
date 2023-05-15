package aula17;

public class For {
    public static void main(String[] args){

        for (int i=5; i >= 0 ; i-- ){
            System.out.println("i tem valor de: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }

        //Podemos usar com partes ausentes porem não é muito comum
        /* int i = 0;
        for ( ; i < 10 ;){
            System.out.println("valor de i: " + i  );
            i += 2;
        } */
        //mesma coisa de:
        for (int cont = 0 ; cont < 10 ; cont += 2){
            System.out.println("valor de cont: " + cont);
        }

        int soma = 0;
        for (int i=1; i < 5; soma += i++ )
            System.out.println("O valor da soma é: " + soma);

    }
}
