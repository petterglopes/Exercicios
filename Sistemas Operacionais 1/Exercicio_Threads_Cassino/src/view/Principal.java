package view;

import controller.Cassino;

public class Principal {

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			Thread tc = new Cassino(i);
			tc.start();
		}
	}

}
