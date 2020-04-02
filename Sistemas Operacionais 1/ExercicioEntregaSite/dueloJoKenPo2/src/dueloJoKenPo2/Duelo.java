package dueloJoKenPo2;

public class Duelo implements Runnable{
	private Time timeA;
	private Time timeB;
	private int indiceJogador;

	public Duelo(Time timeA, Time timeB, int i) {
		this.timeA = timeA;
		this.timeB = timeB;
		this.indiceJogador = i;
	}

	@Override
	public void run() {

		int cont = 0;
		do {
			timeA.getJogador(indiceJogador).jogada();
			timeB.getJogador(indiceJogador).jogada();
			
			String jogadaA = timeA.getJogador(indiceJogador).getJogada();
			String jogadaB = timeB.getJogador(indiceJogador).getJogada();
			
			System.out.println("(" + timeA.getJogador(indiceJogador).getNome() + " " + timeA.getNome() + ") " + jogadaA + " x " + jogadaB + " (" + timeB.getJogador(indiceJogador).getNome() + " " + timeB.getNome() + ")");
						
			if(!jogadaA.equals(jogadaB)) {
				if((jogadaA + jogadaB).matches("pedratesoura") || (jogadaA + jogadaB).matches("tesourapapel") || (jogadaA + jogadaB).matches("papelpedra")) {
					timeA.getJogador(indiceJogador).setPontos();
					System.out.println(timeA.getJogador(indiceJogador).getNome() + " " + timeA.getNome() + " fez " + timeA.getJogador(indiceJogador).getPontos() + " pontos.");
					cont++;
					if(timeA.getJogador(indiceJogador).getPontos() == 3) {
						timeA.setPontos();
						System.out.println(timeA.getNome() + " fez " + timeA.getPontos() + " pontos.");
					}
				}else {
					timeB.getJogador(indiceJogador).setPontos();
					System.out.println(timeB.getJogador(indiceJogador).getNome() + " " + timeB.getNome() + " fez " + timeB.getJogador(indiceJogador).getPontos() + " pontos.");
					cont++;
					if(timeB.getJogador(indiceJogador).getPontos() == 3) {
						timeB.setPontos();
						System.out.println(timeB.getNome() + " fez " + timeB.getPontos() + " pontos.");
					}
				}
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while((timeA.getPontos() < 3 && timeB.getPontos() < 3) || cont < 5);
		
	}
	
}
