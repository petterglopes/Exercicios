package exercicios.exercicio1;

public class Paciente {
	private String nome;
	private int idade;
	private String numeroProntuario;

	public Paciente(String nome, int idade, String numeroProntuario) {
		this.nome = nome;
		this.idade = idade;
		this.numeroProntuario = numeroProntuario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNumeroProntuario() {
		return numeroProntuario;
	}

	public void setNumeroProntuario(String numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}
}
