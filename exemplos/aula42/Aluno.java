package aula42;

import java.util.Arrays;
import java.util.Objects;

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

		
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(notas);
			result = prime * result + Objects.hash(curso);
			return result;
		}

		
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return Objects.equals(curso, other.curso) && Arrays.equals(notas, other.notas);
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

		
	

