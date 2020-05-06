package br.com.alura.threads.execicios;

public class RespostaMain {

	public static void main(String[] args) {
		Thread thread = new Thread(new ImprimeString());
		thread.start();
	}

}
