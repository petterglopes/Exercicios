package triatlo;

import java.util.concurrent.Semaphore;

public class Atleta implements Runnable, Comparable<Atleta> {

	private String nome;
	private int pontos;
	private Juiz juiz;
	private Semaphore pistolaTiroAoAlvo;
	private Semaphore linhaDeChegada;

	public Atleta(String nome, Juiz juiz, Semaphore pistolaTiroAoAlvo, Semaphore linhaDeChegada) {
		this.nome = nome;
		this.juiz = juiz;
		this.pistolaTiroAoAlvo = pistolaTiroAoAlvo;
		this.linhaDeChegada = linhaDeChegada;

	}

	@Override
	public void run() {
		corrida();
		try {
			pistolaTiroAoAlvo.acquire();
			tiroAoAlvo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			pistolaTiroAoAlvo.release();
		}
		ciclismo();
	}

	private void corrida() {

		int distancia = 0;
		int velocidade = (int) (20 + Math.random() * 6);

		for (int i = 0; i < 3000; i += velocidade) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (3000 - distancia > velocidade) {
				distancia += velocidade;
			} else {
				distancia += (3000 - distancia);
			}
		}

		System.out.println("O " + nome + " terminou a prova de corrida de " + distancia / 1000 + " Km.");

	}

	private void tiroAoAlvo() {

		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep((int) (500 + Math.random() * 2501));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			pontos += (int) (Math.random() * 11);
		}
		System.out.println("O " + nome + " fez um total de " + pontos + " durante a prova de tiro ao alvo.");
	}

	private void ciclismo() {

		int distancia = 0;
		int velocidade = (int) (30 + Math.random() * 11);

		for (int i = 0; i < 5000; i += velocidade) {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (5000 - distancia > velocidade) {
				distancia += velocidade;
			} else {
				try {
					distancia += (5000 - distancia);
					linhaDeChegada.acquire();
					System.out.println("O " + nome + " termiminou a prova de ciclismo.");
					juiz.pontuacaoFinal(Atleta.this);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					linhaDeChegada.release();
				}
			}
		}
	}

	public void pontuacaoTotal(int pontosCiclismo) {
		pontos += pontosCiclismo;
	}

	public int getPontos() {
		return pontos;
	}

	@Override
	public String toString() {
		return "O " + nome + " fez " + pontos + " pontos\n";
	}

	@Override
	public int compareTo(Atleta outroAtleta) {
		if (this.pontos > outroAtleta.getPontos()) {
			return -1;
		}
		if (this.pontos < outroAtleta.getPontos()) {
			return 1;
		}
		return 0;

	}

}
