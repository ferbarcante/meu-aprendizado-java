package aula42;

import java.util.Arrays;

public class Aluno {

		private String curso;
		private double[] notas;
		
		public Aluno() {
			super();
		}
		
		//usamos o super sempre que fomos fazer referencia a super classe
		/*public Aluno(String nome, String endereco, String telefone, String cpf, String curso) {
			super(nome, endereco, telefone, cpf);
			this.curso = curso;
		}
		*/

		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public double[] getNotas() {
			return notas;
		}
		public void setNotas(double[] notas) {
			this.notas = notas;
		}
		
		public double calcularMedia() {
			return 0;
		}
		
		public boolean verificarAprovado() {
			return true;
		}


		public String toString() {
			return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
		}
		
		/*public void metodoQualquer() {
			super.setCpf("232423");
		}
		
		public String obterEtiquetaEndereco() {
			
			String s = "endereco do aluno: ";
			s += this.getEndereco();
			
			return s;
		}
		*/
		
	/*	public String toString() {
			
			String s = curso + "\n";
			for(double nota : notas) {
				s += nota + " "; 
			}
			return s;
		}
	
	*/
}	
		
	

