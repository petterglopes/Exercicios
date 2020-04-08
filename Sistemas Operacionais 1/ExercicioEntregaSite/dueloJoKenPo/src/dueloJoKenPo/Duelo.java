package dueloJoKenPo;

public class Duelo implements Runnable{
	private Time timeA;
	private Time timeB;
	private int indiceJogador;
	private Juiz juiz;

	public Duelo(Time timeA, Time timeB, int i, Juiz juiz) {
		this.timeA = timeA;
		this.timeB = timeB;
		this.indiceJogador = i;
		this.juiz = juiz;
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
						
			if(!jogadaA.matches(jogadaB)) {
				if((jogadaA + jogadaB).matches("pedratesoura") || (jogadaA + jogadaB).matches("tesourapapel") || (jogadaA + jogadaB).matches("papelpedra")) {
					juiz.verifica(timeA, timeA.getJogador(indiceJogador), Thread.currentThread());
					cont++;
				}else {
					juiz.verifica(timeB, timeB.getJogador(indiceJogador), Thread.currentThread());
					cont++;
				}
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(timeA.getPontos() < 3 && timeB.getPontos() < 3 && cont < 5);
		
	}
	
}
