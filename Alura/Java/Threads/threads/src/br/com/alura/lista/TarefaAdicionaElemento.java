package br.com.alura.lista;

public class TarefaAdicionaElemento implements Runnable {

	private Lista lista;
	private String numeroDoThread;

	public TarefaAdicionaElemento(Lista lista, String numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			lista.adicionaElementos("Thread " + numeroDoThread + " - " + i);
		}
		

	}

}
