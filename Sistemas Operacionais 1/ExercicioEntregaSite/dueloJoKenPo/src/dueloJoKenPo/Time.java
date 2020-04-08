package dueloJoKenPo;

public class Time {
	
	private String nome;
	private int pontos = 0;
	private Jogador [] jogador = new Jogador[5];
	
	public Time(String nome) {
		
		this.nome = nome;
		
		for (int i = 0; i < 5; i++) {
			jogador [i] =  new Jogador("Jogador " + i);	
		}
		
	}
	
	public Jogador getJogador(int indice) {
		return jogador [indice];
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
}
