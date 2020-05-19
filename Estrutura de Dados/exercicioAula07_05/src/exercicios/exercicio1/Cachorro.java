package exercicios.exercicio1;

public class Cachorro {
	private String raça;
	private String nome;
	private int idade;
	
	public Cachorro(String raça, String nome, int idade) {
		this.raça = raça;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
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
	
}
