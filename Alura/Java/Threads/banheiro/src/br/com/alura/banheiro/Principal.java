package br.com.alura.banheiro;

public class Principal {

	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		
		for(int i = 0; i < 5; i++) {
			new Thread(new TarefaNumero1(banheiro), "convidado" + i).start();
		}
		
		for(int i = 05; i < 10; i++) {
			new Thread(new TarefaNumero2(banheiro), "convidado" + i).start();
		}
	}
}
