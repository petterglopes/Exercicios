package view;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.swing.JOptionPane;

import controller.Ordenacao;
import controller.Producao;
import controller.ProducaoController;

public class Principal {
	public static void main(String[] args) throws IOException {
//		Producao producao = new Producao();
//		ProducaoController controller = new ProducaoController();
//		Ordenacao ordenacao = new Ordenacao();
//		
//		String path = "D:\\Usuários\\Petter\\OneDrive - Fatec Centro Paula Souza\\Disciplinas\\Estrutura de Dados\\ManipulacaoArquivo";
//		String nomeArquivoEntrada = "entrada.txt";
//		String nomeArquivoSaida = "saida.txt";
//		
//		
//		File arquivoEntrada = new File(path, nomeArquivoEntrada);
//		File arquivoSaida = new File(path, nomeArquivoSaida);
//		
//		if(arquivoEntrada.exists())
//			arquivoEntrada.delete();
//		
//		controller.create(path, nomeArquivoEntrada);
//		
//		controller.read(path, nomeArquivoEntrada);
//		
//		for(int i = 0; i < 5; i++) {
//			producao.setId(BigInteger.valueOf(i + 1));
//			producao.setProduto("Produto " + (i + 1));
//			producao.setQuantidade((int)(100 + Math.random() * 901));
//			producao.setDataProducao(LocalDate.now());
//			producao.setHoraProducao(LocalTime.now());
//			producao.setCustoProducao((int)(1000 + Math.random() * 9001));
//			controller.insert(producao, path, nomeArquivoEntrada);
//		}
//		
//		controller.read(path, nomeArquivoEntrada);
//		
//		List<Producao> lista = ordenacao.obtemListaDoArquivo(arquivoEntrada);
//		
//		lista.forEach(item -> {
//			System.out.println(item.getId() + ";" + item.getProduto() + ";" + item.getQuantidade() + ";"
//					+ item.getDataProducao() + ";" + item.getHoraProducao() + ";" + item.getCustoProducao() + ";");
//		});
//		
//		System.out.println("\n");
//		
//		Ordenacao.ordenaQuatidadeComMetodoEscolhido(lista);
//		
//		lista.forEach(item -> {
//			System.out.println(item.getId() + ";" + item.getProduto() + ";" + item.getQuantidade() + ";"
//					+ item.getDataProducao() + ";" + item.getHoraProducao() + ";" + item.getCustoProducao() + ";");
//		});
//		
//		ordenacao.createArquivoSaida(arquivoSaida, lista);
//		
//		producao.setId(BigInteger.valueOf(6));
//		producao.setProduto("Produto " + (6));
//		producao.setQuantidade((int)(100 + Math.random() * 901));
//		producao.setDataProducao(LocalDate.now());
//		producao.setHoraProducao(LocalTime.now());
//		producao.setCustoProducao((int)(1000 + Math.random() * 9001));
//		controller.insert(producao, path, arquivo);
//		
//		controller.read(path, arquivo);
//		
//		producao.setId(BigInteger.valueOf(4));
//		producao.setProduto("Produto " + 4);
//		producao.setQuantidade((int)(100 + Math.random() * 901));
//		producao.setDataProducao(LocalDate.now());
//		producao.setHoraProducao(LocalTime.now());
//		producao.setCustoProducao((int)(1000 + Math.random() * 9001));
//		controller.update(producao , path, arquivo);
//		
//		controller.read(path, arquivo);
//		
//		controller.delete(path, arquivo);
//		
//		controller.read(path, arquivo);
	}
}
