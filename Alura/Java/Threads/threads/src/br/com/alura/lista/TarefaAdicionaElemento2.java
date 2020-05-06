package br.com.alura.lista;

import java.util.List;

public class TarefaAdicionaElemento2 implements Runnable {

	private List<String> lista;
	private int numeroDoThread;

	public TarefaAdicionaElemento2(List<String> lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			lista.add("Thread " + numeroDoThread + " - " + i);
		}
		

	}

}
