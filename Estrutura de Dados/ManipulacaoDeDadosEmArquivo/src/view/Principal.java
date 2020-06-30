package view;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import controller.ManipulaArquivo;
import controller.Ordenacao;
import controller.Producao;
import controller.ProducaoController;

public class Principal {
	public static void main(String[] args) throws IOException {
		Producao producao = new Producao();
		ProducaoController controller = new ProducaoController();
		ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
		
		String path = "D:\\Usuários\\Petter\\OneDrive - Fatec Centro Paula Souza\\Disciplinas\\Estrutura de Dados\\ManipulacaoArquivo";
		String nomeArquivoEntrada = "entrada.txt";
		String nomeArquivoSaidaBubbleSort = "saidaBubbleSort.txt";
		String nomeArquivoSaidaMergeSort = "saidaMergeSort.txt";
		
		
		File arquivoEntrada = new File(path, nomeArquivoEntrada);
		File arquivoSaidaBubbleSort = new File(path, nomeArquivoSaidaBubbleSort);
		File arquivoSaidaMergeSort = new File(path, nomeArquivoSaidaMergeSort);
		
		if(arquivoEntrada.exists())
			arquivoEntrada.delete();
		
		controller.create(arquivoEntrada);
		
		for(int i = 0; i < 5; i++) {
			producao.setId(BigInteger.valueOf(i + 1));
			producao.setProduto("Produto " + (i + 1));
			producao.setQuantidade((int)(100 + Math.random() * 901));
			producao.setDataProducao(LocalDate.now());
			producao.setHoraProducao(LocalTime.now());
			producao.setCustoProducao((int)(1000 + Math.random() * 9001));
			controller.insert(arquivoEntrada, producao);
		}
		
		System.out.println("Primeiro inserção de dados no arquivo\n");
		
		controller.read(arquivoEntrada);
		
		List<Producao> listaProducao = manipulaArquivo.lerArquivo(arquivoEntrada);
		
		for(int i = 0; i < 5; i++) {
			producao.setId(BigInteger.valueOf(i + 6));
			producao.setProduto("Produto " + (i + 6));
			producao.setQuantidade((int)(100 + Math.random() * 901));
			producao.setDataProducao(LocalDate.now());
			producao.setHoraProducao(LocalTime.now());
			producao.setCustoProducao((int)(1000 + Math.random() * 9001));
			controller.insert(arquivoEntrada, producao);
		}
		
		System.out.println("\nSegunda inserção de dados no arquivo\n");
		
		controller.read(arquivoEntrada);
		
		System.out.println("\nPrimeiro update de dados no arquivo\n");
		
		producao.setId(BigInteger.valueOf(10));
		producao.setProduto("Produto " + (10));
		producao.setQuantidade((int)(100 + Math.random() * 901));
		producao.setDataProducao(LocalDate.now());
		producao.setHoraProducao(LocalTime.now());
		producao.setCustoProducao((int)(1000 + Math.random() * 9001));
		controller.update(arquivoEntrada, producao);
		
		controller.read(arquivoEntrada);
		
		controller.delete(arquivoEntrada);
		
		System.out.println("\nPrimeiro delete de dados no arquivo\n");
		
		controller.read(arquivoEntrada);
		
		System.out.println("\n\n\nLista ordenado pelo metodo Bubble Sort\n");
		
		listaProducao = manipulaArquivo.lerArquivo(arquivoEntrada);
		
		Ordenacao.bubbleSort(listaProducao);
		
		controller.create(arquivoSaidaBubbleSort);
		
		listaProducao.forEach(itemProducao ->{
			try {
				controller.insert(arquivoSaidaBubbleSort, itemProducao);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});	
		
		controller.read(arquivoSaidaBubbleSort);
		
		System.out.println("\n\n\nLista ordenado pelo metodo Merge Sort\n");
		
		listaProducao = manipulaArquivo.lerArquivo(arquivoEntrada);
		
		Ordenacao.bubbleSort(listaProducao);
		
		controller.create(arquivoSaidaMergeSort);
		
		listaProducao.forEach(itemProducao ->{
			try {
				controller.insert(arquivoSaidaMergeSort, itemProducao);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});	
		
		controller.read(arquivoSaidaMergeSort);
	}
}
