package view;

import controller.Aviao;

public class CicloDecolagem {

	public static void main(String[] args) {		
		for(int i = 1; i < 12; i++) {			
			new Thread (new Aviao("Aviao " + i)).start();
		}
	}
}
