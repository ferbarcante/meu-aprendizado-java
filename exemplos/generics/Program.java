package generics;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		for(int i = 1; i<=5; i++) {
			soma = soma + i;
		}
		System.out.println(soma);
	}

}
