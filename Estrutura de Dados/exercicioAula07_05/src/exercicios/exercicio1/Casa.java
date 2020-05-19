package exercicios.exercicio1;

public class Casa {
	private String endereco;
	private int numero;
	private int comodos;
	
	public Casa(String endereco, int numero, int comodos) {
		this.endereco = endereco;
		this.numero = numero;
		this.comodos = comodos;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getComodos() {
		return comodos;
	}

	public void setComodos(int comodos) {
		this.comodos = comodos;
	}
}
