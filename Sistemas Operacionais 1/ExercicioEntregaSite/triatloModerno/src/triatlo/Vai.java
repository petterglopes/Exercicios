package triatlo;

import java.util.concurrent.Semaphore;

public class Vai {
	
	public static void main(String[] args) {
		
		Juiz juiz = new Juiz();
		Semaphore pistolaTiroAoAlvo = new Semaphore(5);
		Semaphore linhaDeChegada = new Semaphore(1);
		
		System.out.println("Foi dada a largada.");
		
		for(int i = 0; i < 25; i++) {
			new Thread(new Atleta("Atleta " + i, juiz, pistolaTiroAoAlvo, linhaDeChegada)).start();
		}
	}

}
