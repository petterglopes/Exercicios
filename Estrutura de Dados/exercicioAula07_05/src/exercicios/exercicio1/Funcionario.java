package exercicios.exercicio1;

public class Funcionario {
	private String nome;
	private int idade;
	private String atribuicao;
	private int salario;

	public Funcionario(String nome, int idade, String atribuicao, int salario) {
		this.nome = nome;
		this.idade = idade;
		this.atribuicao = atribuicao;
		this.salario = salario;
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

	public String getAtribuicao() {
		return atribuicao;
	}

	public void setAtribuicao(String atribuicao) {
		this.atribuicao = atribuicao;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
}
