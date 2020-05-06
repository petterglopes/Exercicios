package br.com.alura.lista;

import java.util.List;
import java.util.Vector;

public class Principal2 {

	public static void main(String[] args) throws InterruptedException {
//		List<String> lista = Collections.synchronizedList(new ArrayList<String>());
		List<String> lista = new Vector<String>();
		
		for(int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionaElemento2(lista, i)).start();
		}
		
		Thread.sleep(2000);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
