package duelo;

public class Time {
	
	Partida partida;
	private String nome;
	private static int pontos = 0;
	
	public Time(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public synchronized void setPontos() {
		pontos ++;
	}

}
