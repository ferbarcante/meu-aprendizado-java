package aula41;

import aula40.Aluno;
import aula40.Pessoa;
import aula40.Professor;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua Osmar Viera");
		aluno.setEndereco("Rua Orlando Gomes");
		professor.setEndereco("Rua Periperi");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
	}

}
