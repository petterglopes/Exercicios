package dueloJoKenPo;

public class Jogador {
	private int pontos = 0;
	private String nome;
	private String jogada;
	

	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public int getPontos() {
		return pontos;
	}
	public void setPontos() {
		this.pontos ++;
	}
	public String getNome() {
		return nome;
	}
	
	public void jogada() {
		int aleatorio = (int)(Math.random() * 3);
		if(aleatorio == 0) {
			this.jogada = "pedra";
		}else if(aleatorio == 1) {
			this.jogada = "papel";
		}else{
			this.jogada = "tesoura";
		}
	}

	public String getJogada() {
		return jogada;
	}

}
