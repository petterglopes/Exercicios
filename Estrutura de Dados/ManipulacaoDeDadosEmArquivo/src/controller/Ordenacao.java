package controller;

import java.util.LinkedList;
import java.util.List;

public class Ordenacao {

	public static void bubbleSort(List<Producao> lista) {

		for (int ultimo = lista.size() - 1; ultimo > 0; ultimo--) {
			for (int i = 0; i < ultimo; i++) {
				if (lista.get(i).getQuantidade() > lista.get(i + 1).getQuantidade()) {
					Producao producaoAux = lista.get(i);
					lista.set(i, lista.get(i + 1));
					lista.set(i + 1, producaoAux);
				}
			}
		}
	}

	public static void iniciaMerge(List<Producao> lista) {
		List<Producao> listaAux = new LinkedList<Producao>();

		for (int i = 0; i < lista.size(); i++) {
			Producao producao = new Producao();
			producao.setId(null);
			producao.setProduto(null);
			producao.setQuantidade(0);
			producao.setDataProducao(null);
			producao.setHoraProducao(null);
			producao.setCustoProducao(0);
			listaAux.add(producao);
		}
		mergeSort(lista, listaAux, 0, lista.size() - 1);
	}

	private static void mergeSort(List<Producao> l1, List<Producao> l2, int init, int fim) {
		if (init < fim) {
			int meio = (init + fim) / 2;
			mergeSort(l1, l2, init, meio);
			mergeSort(l1, l2, meio + 1, fim);
			intercalar(l1, l2, init, meio, fim);
		}
	}

	private static void intercalar(List<Producao> l1, List<Producao> l2, int init, int meio, int fim) {
		for (int k = init; k <= fim; k++) {
			l2.set(k, l1.get(k));
		}

		int i = init;
		int j = meio + 1;

		for (int k = init; k <= fim; k++) {
			if (i > meio) {
				l1.set(k, l2.get(j++));
			} else if (j > fim) {
				l1.set(k, l2.get(i++));
			} else if (l2.get(i).getQuantidade() < l2.get(j).getQuantidade()) {
				l1.set(k, l2.get(i++));
			} else {
				l1.set(k, l2.get(j++));
			}
		}
	}
}
