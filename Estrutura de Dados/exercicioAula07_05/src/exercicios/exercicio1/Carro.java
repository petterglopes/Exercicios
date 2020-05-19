package exercicios.exercicio1;

public class Carro {
	private String modelo;
	private int ano;
	private String marca;

	public Carro(String nome, int idade, String marca) {
		this.modelo = nome;
		this.ano = idade;
		this.marca = marca;
	}
	
	public String getNome() {
		return modelo;
	}

	public void setNome(String nome) {
		this.modelo = nome;
	}

	public int getIdade() {
		return ano;
	}

	public void setIdade(int idade) {
		this.ano = idade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}

