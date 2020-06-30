package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ordenacao {

	private Producao criaProducao(String linha) {
		String atributo[] = linha.split(";");

		Producao producao = new Producao();
		producao.setId(BigInteger.valueOf(Integer.parseInt(atributo[0])));
		producao.setProduto(atributo[1]);
		producao.setQuantidade(Integer.parseInt(atributo[2]));
		producao.setDataProducao(LocalDate.parse(atributo[3]));
		producao.setHoraProducao(LocalTime.parse(atributo[4]));
		producao.setCustoProducao(Integer.parseInt(atributo[5]));

		return producao;
	}

	public List<Producao> obtemListaDoArquivo(File arquivo) throws IOException {
		FileInputStream fluxo = new FileInputStream(arquivo);
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		List<Producao> listaProducao = new LinkedList<>();
		String linha = "";
		buffer.readLine();
		while (linha != null) {
			linha = buffer.readLine();
			if (linha != null) {
				listaProducao.add(criaProducao(linha));
			}
		}
		buffer.close();
		leitor.close();
		fluxo.close();
		return listaProducao;
	}

	public static void ordenaQuatidadeComMetodoEscolhido(List<Producao> lista) {
		int key = -1;
		List<Producao> lista2 = new LinkedList<Producao>();
		
		for (int i = 0; i < lista.size(); i++) {
			Producao producao = new Producao();
			producao.setId(null);
			producao.setProduto(null);
			producao.setQuantidade(0);
			producao.setDataProducao(null);
			producao.setHoraProducao(null);
			producao.setCustoProducao(0);
			lista2.add(producao);
		}
		
		while(key != 3) {

			key = Integer.parseInt(JOptionPane
					.showInputDialog("Digite 1 para bubbleSort, 2 para mergeSort ou 3 para sair do metodo de ordena��o"));
			
			switch (key) {
			case 1:
				bubbleSort(lista);
//				return lista;
			case 2: 
				mergeSort(lista, lista2, 0, lista.size() - 1);
//				return lista;
			case 3:
//				return lista;
			default:
				JOptionPane.showMessageDialog(null, "Op��o invalida");
			}
		}				
	}

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

	public static void mergeSort(List<Producao> l1, List<Producao> l2, int init, int fim) {
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
			if (i > meio)
				l1.set(k, l2.get(j++));
			else if (j > fim)
				l1.set(k, l2.get(i++));
			else if (l2.get(i).getQuantidade()< l2.get(j).getQuantidade())
				l1.set(k, l2.get(i++));
			else
				l1.set(k, l2.get(j++));
		}
	}

	public void createArquivoSaida(File arquivo, List<Producao> lista) throws IOException {
		String linha = "ID;Produto;quantidade;dataProducao;horaProducao;custoProducao;\n";
		FileWriter fileWriter = new FileWriter(arquivo);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.write(linha);
		lista.forEach(itemProducao -> {
			printWriter.write(itemProducao.getId() + ";" + itemProducao.getProduto() + ";"
					+ itemProducao.getQuantidade() + ";" + itemProducao.getDataProducao() + ";"
					+ itemProducao.getHoraProducao() + ";" + itemProducao.getCustoProducao() + ";\n");
		});
		printWriter.flush();
		printWriter.close();
		fileWriter.close();
	}
}
