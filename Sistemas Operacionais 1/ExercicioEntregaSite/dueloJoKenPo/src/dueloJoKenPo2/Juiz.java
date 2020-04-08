package dueloJoKenPo2;

public class Juiz {

	@SuppressWarnings("deprecation")
	public synchronized void verifica(Time time, Jogador jogador, Thread thread) {

		int vencedor = 0;

		if (vencedor == 0) {
			jogador.setPontos();
			System.out.println(jogador.getNome() + " " + time.getNome() + " fez " + jogador.getPontos() + " pontos.");
			if (jogador.getPontos() == 3) {
				time.setPontos();
				System.out.println(time.getNome() + " fez " + time.getPontos() + " pontos.");
				if (time.getPontos() == 3) {
					vencedor = 1;
					System.out.println("Time " + time.getNome() + " é o vencedor.");
					thread.stop();
				}
			}
		}else {
			thread.stop();
		}

	}

}
