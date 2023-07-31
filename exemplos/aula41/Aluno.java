package aula41;

public class Aluno extends Pessoa{

		private String curso;
		private Double[] notas;
		
		public Aluno() {
			super();
		}
		
		//usamos o super sempre que fomos fazer referencia a super classe
		public Aluno(String nome, String endereco, String telefone, String cpf, String curso) {
			super(nome, endereco, telefone, cpf);
			this.curso = curso;
		}


		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public Double[] getNotas() {
			return notas;
		}
		public void setNotas(Double[] notas) {
			this.notas = notas;
		}
		
		public double calcularMedia() {
			return 0;
		}
		
		public boolean verificarAprovado() {
			return true;
		}
		
		public void metodoQualquer() {
			super.setCpf("232423");
		}
		
		public String obterEtiquetaEndereco() {
			
			String s = "endereco do aluno: ";
			s += this.getEndereco();
			
			return s;
		}
		
		
}
