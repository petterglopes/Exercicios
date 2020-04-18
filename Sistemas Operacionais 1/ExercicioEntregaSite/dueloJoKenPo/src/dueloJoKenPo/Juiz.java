package dueloJoKenPo;

public class Juiz {

	private int vencedor = 0;

	@SuppressWarnings("deprecation")
	public void verifica(Time time, Jogador jogador, Thread thread) {

		if (vencedor == 0) {
			if (jogador.getPontos() < 3) {
				jogador.setPontos();
				System.out
						.println(jogador.getNome() + " " + time.getNome() + " fez " + jogador.getPontos() + " pontos.");
				if (jogador.getPontos() == 3) {
					time.setPontos();
					System.out.println(time.getNome() + " fez " + time.getPontos() + " pontos.");
					if (time.getPontos() == 3) {
						vencedor = 1;
						System.out.println("Time " + time.getNome() + " é o vencedor.");
						thread.stop();
					}
				}
			}
		} else {
			thread.stop();
		}

	}

}
