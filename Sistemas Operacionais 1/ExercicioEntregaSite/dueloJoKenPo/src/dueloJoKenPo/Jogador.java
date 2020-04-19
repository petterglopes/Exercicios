package dueloJoKenPo;

public class Jogador {
	private int pontos = 0;
	private String nome;
	private String jogada;
	private String [] escolhasPossiveis = {"pedra", "papel", "tesoura"};
	

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
	
	public void joga() {
		this.jogada = escolhasPossiveis[(int)(Math.random() * 3)];
	}

	public String getJogada() {
		return jogada;
	}

}
