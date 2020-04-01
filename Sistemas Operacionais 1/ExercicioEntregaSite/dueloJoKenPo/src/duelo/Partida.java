package duelo;

public class Partida implements Runnable {
	private Time timeA = new Time("Time A");
	private Time timeB = new Time("Time B");
	private Jogador oponente1;
	private Jogador oponente2;

	public Partida(String jogador) {
		oponente1 = new Jogador(timeA, jogador);
		oponente2 = new Jogador(timeB, jogador);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			if(timeA.getPontos() >= 3 || timeB.getPontos() >= 3) {
				break;
			}
			oponente1.jogada();
			oponente2.jogada();
			int resultado = (this.oponente1.getJogada() + this.oponente2.getJogada()).hashCode();
			System.out.println("(" + oponente1.getNome() + " " + oponente1.getTime().getNome() + ") " + oponente1.getJogada() + " x " + oponente2.getJogada() + " (" + oponente2.getNome() + " " + oponente2.getTime().getNome() + ")");
			if (oponente1.getJogada() == oponente2.getJogada()) {
				i--;
			} else {
				if (resultado == "tesourapapel".hashCode() || resultado == "papelpedra".hashCode() || resultado == "pedratesoura".hashCode()) {
					oponente1.setPontos();
				} else {
					oponente2.setPontos();
				}
			}
			if(oponente1.getPontos() >= 3) {
				System.out.println(oponente1.getNome() + " " + oponente1.getTime().getNome() + " venceu a partida com " + oponente1.getPontos() + " pontos.");
			}
			if(oponente2.getPontos() >= 3) {
				System.out.println(oponente2.getNome() + " " + oponente2.getTime().getNome() + " venceu a partida com " + oponente2.getPontos() + " pontos.");
			}
			if (oponente1.getJogada() != oponente2.getJogada()) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
