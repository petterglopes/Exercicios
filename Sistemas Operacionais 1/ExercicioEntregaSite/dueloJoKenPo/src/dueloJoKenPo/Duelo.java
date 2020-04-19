package dueloJoKenPo;

import java.util.concurrent.Semaphore;

public class Duelo implements Runnable{
	private Time timeA;
	private Time timeB;
	private int indiceJogador;
	private Juiz juiz;
	private Semaphore semaforo;

	public Duelo(Time timeA, Time timeB, int i, Juiz juiz, Semaphore semaforo) {
		this.timeA = timeA;
		this.timeB = timeB;
		this.indiceJogador = i;
		this.juiz = juiz;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {

		int cont = 0;
		do {
			timeA.getJogador(indiceJogador).joga();
			timeB.getJogador(indiceJogador).joga();
			
			String jogadaA = timeA.getJogador(indiceJogador).getJogada();
			String jogadaB = timeB.getJogador(indiceJogador).getJogada();
			
			System.out.println("(" + timeA.getJogador(indiceJogador).getNome() + " " + timeA.getNome() + ") " + jogadaA + " x " + jogadaB + " (" + timeB.getJogador(indiceJogador).getNome() + " " + timeB.getNome() + ")");
						
			try {
				if(!jogadaA.matches(jogadaB)) {
					if((jogadaA + jogadaB).matches("pedratesoura") || (jogadaA + jogadaB).matches("tesourapapel") || (jogadaA + jogadaB).matches("papelpedra")) {
						semaforo.acquire();
						juiz.verifica(timeA, timeA.getJogador(indiceJogador), Thread.currentThread());
						cont++;
					}else {
						semaforo.acquire();
						juiz.verifica(timeB, timeB.getJogador(indiceJogador), Thread.currentThread());
						cont++;
					}
				}
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				semaforo.release();
			}
		}while(timeA.getPontos() < 3 && timeB.getPontos() < 3 && cont < 5);
	}
}
