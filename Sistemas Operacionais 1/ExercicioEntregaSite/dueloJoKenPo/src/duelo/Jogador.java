package duelo;

public class Jogador{
	private Time time;
	private String nome;
	private String jogada;
	private int pontos = 0;
	

	public Jogador(Time time, String nome) {
		this.time = time;
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return this.pontos;
	}

	public void setPontos() {
		this.pontos ++;
		if(this.pontos == 3) {
			time.setPontos();
		}
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
		return this.jogada;
	}

}
