package aula20;

public class MatrizesForEach {
    public static void main(String[] args){

        int[][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 4;

        dias[1][0] = 5;
        dias[1][1] = 3;
        dias[1][2] = 2;

        dias[2][0] = 6;
        dias[2][1] = 3;
        dias[2][2] = 9;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j <dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------------");

        //pelo for each ele pegara cada tipo e criará uma variável de referencia

        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
