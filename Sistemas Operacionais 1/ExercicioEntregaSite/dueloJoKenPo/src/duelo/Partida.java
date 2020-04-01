package duelo;

public class Partida implements Runnable {
	private Time timeA = new Time("Time A");
	private Time timeB = new Time("Time B");
	private Jogador oponente1;
	private Jogador oponente2;
	static int vencedor = 0;

	public Partida(String jogador) {
		oponente1 = new Jogador(timeA, jogador);
		oponente2 = new Jogador(timeB, jogador);
	}

	@Override
	public void run() {
//		for (int i = 0; i < 5; i++) {
			oponente1.jogada();
			oponente2.jogada();
			String resultado = this.oponente1.getJogada() + this.oponente2.getJogada();
			//System.out.println(resultado);
			System.out.println("(" + oponente1.getNome() + " " + oponente1.getTime().getNome() + ") "
					+ oponente1.getJogada() + " x " + oponente2.getJogada() + " (" + oponente2.getNome() + " "
					+ oponente2.getTime().getNome() + ")");
			if (oponente1.getJogada() == oponente2.getJogada()) {
/*				i--;*/run();			;
			} else {
				if (resultado == "TesouraPapel") {
					System.out.println(
							"Jogador " + oponente1.getNome() + " " + oponente1.getTime().getNome() + " fez 1 ponto.");
					oponente1.setPontos();
				} else if (resultado == "PapelPedra") {
					System.out.println(
							"Jogador " + oponente1.getNome() + " " + oponente1.getTime().getNome() + " fez 1 ponto.");
					oponente1.setPontos();
				} else if (resultado == "PedraTesoura") {
					System.out.println(
							"Jogador " + oponente1.getNome() + " " + oponente1.getTime().getNome() + " fez 1 ponto.");
					oponente1.setPontos();
				} else {
					System.out.println(
							"Jogador " + oponente2.getNome() + " " + oponente2.getTime().getNome() + " fez 1 ponto.");
					oponente2.setPontos();
				}
			}

			if (timeA.getPontos() == 3) {
				vencedor = 1;
				System.out.println("Time A venceu");
			} else if (timeB.getPontos() == 3) {
				vencedor = 1;
				System.out.println("Time B venceu");
			}
//		}
	}
}
