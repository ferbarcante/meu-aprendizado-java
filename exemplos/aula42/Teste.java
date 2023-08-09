package aula42;

public class Teste {

	public static void main(String[] args) {

			Aluno aluno = new Aluno();
			
			aluno.setCurso("Eng de software");
			double[] notas = { 10, 9, 8, 7};
			aluno.setNotas(notas);
			
			System.out.println(aluno);
	}

}
