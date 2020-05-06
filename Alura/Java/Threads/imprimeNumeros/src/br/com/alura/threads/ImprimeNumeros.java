package br.com.alura.threads;

public class ImprimeNumeros implements Runnable{

	@Override
	public void run() {

		for(int i = 1; i <= 1000; i++) {
			Thread atual = Thread.currentThread();
			System.out.println(atual.getId() + " - " + i);
		}
	}

}
