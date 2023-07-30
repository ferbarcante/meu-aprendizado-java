package aula36;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da agenda: ");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("Entre com as infos do contato " + (i+1));
			Contato c = new Contato();
			
			System.out.println("Entre com o nome: ");
			nome = scan.nextLine();
			
			System.out.println("Entre com o telefone: ");
			String telefone = scan.nextLine();
			
			System.out.println("Entre com o email: ");
			String email = scan.nextLine();
			
			c.setNome(nome);
			c.setTelefone(telefone);
			c.setEmail(email);
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		System.out.println(agenda.obterInfo());
				
	}

}
