package view;

import java.util.concurrent.Semaphore;

import controller.Aviao;

public class ToreDeControle {

	public static void main(String[] args) {
		Semaphore semaforoPistaNorte = new Semaphore(1);
		Semaphore semaforoPistaSul = new Semaphore(1);
		String pistaNorte = "Pista Norte";
		String pistaSul = "Pista Sul";
		
		for(int i = 0; i < 12; i++) {
			if((int) (Math.random() * 2) == 1) {			
				new Thread (new Aviao("Aviao " + i, semaforoPistaNorte, pistaNorte)).start();
			}else {				
				new Thread (new Aviao("Aviao " + i, semaforoPistaSul, pistaSul)).start();
			}
		}
	}
}
