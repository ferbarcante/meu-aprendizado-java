package aula41;

public class Professor extends Pessoa {
	
	private String nomeCurso;
	private Double salario;
	
	public Professor() {
	}



	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	public String obterEtiquetaEndereco() {
		
		String s = "endereco do professor: ";
		s += this.getEndereco();
		
		return s;
	}
	
}
