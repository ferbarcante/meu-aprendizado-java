package aula27;

public class ContaCorrente {
    long numero;
    double saldo;
    boolean especial;
    long limite;

    void saque(){

        if(saldo>0){
            String pode = "O cliente pode realizar saques";
        } else {
            String pode = "O cliente não pode realizar saques";
        }

    }
}
