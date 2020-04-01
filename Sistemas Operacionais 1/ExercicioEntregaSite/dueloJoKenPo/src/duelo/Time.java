package duelo;

public class Time {
	
	private String nome;
	private int pontos = 0;
	
	public Time(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos() {
		this.pontos ++;
		if(this.pontos >= 3) {
			System.out.println("O " + this.nome + "venceu o duelo.");
		}
	}

}
