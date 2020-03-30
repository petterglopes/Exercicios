package view;

import controller.Aviao;
import controller.Pista;

public class CicloDecolagem {

	public static void main(String[] args) {
		Pista pistaNorte = new Pista();
		Pista pistaSul = new Pista();
		
		for(int i = 1; i < 12; i++) {
			Pista pistaEscolhida;
			if((int) (Math.random() * 2) == 1) {
				pistaEscolhida = pistaNorte;
			}else {
				pistaEscolhida = pistaSul;
			}
			new Thread (new Aviao(pistaEscolhida)).start();
		}
	}
}
