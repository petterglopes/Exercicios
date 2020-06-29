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

public class OrdenacaoPorTroca {
	
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
		while(linha != null) {
			linha = buffer.readLine();
			if(linha != null) {
				listaProducao.add(criaProducao(linha));
			}
		}
		buffer.close();
		leitor.close();
		fluxo.close();
		return listaProducao;
	}
	
	public List<Producao> ordenaListaProducaoPorQuantidade(List<Producao> lista){
		for(int ultimo = lista.size() - 1; ultimo > 0; ultimo--) {
			for(int i = 0; i < ultimo; i++) {
				if(lista.get(i).getQuantidade() > lista.get(i + 1).getQuantidade()) {
					Producao producaoAux = lista.get(i);
					lista.set(i, lista.get(i + 1));
					lista.set(i + 1, producaoAux);
				}
			}
		}
		
		return lista;
	}
	
	public void createArquivoSaida(File arquivo, List<Producao> lista) throws IOException {
			String linha = "ID;Produto;quantidade;dataProducao;horaProducao;custoProducao;\n";
			FileWriter fileWriter = new FileWriter(arquivo);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.write(linha);
			lista.forEach(itemProducao -> {
				printWriter.write(itemProducao.getId() + ";" + itemProducao.getProduto() + ";" + itemProducao.getQuantidade()
					+ ";" + itemProducao.getDataProducao() + ";" + itemProducao.getHoraProducao() + ";"
					+ itemProducao.getCustoProducao() + ";\n");
			});
			printWriter.flush();
			printWriter.close();
			fileWriter.close();
	}
}
