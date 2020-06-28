package view;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;

import controller.Producao;
import controller.ProducaoController;

public class Principal {
	public static void main(String[] args) throws IOException {
		Producao producao = new Producao();
		ProducaoController controller = new ProducaoController();
		
		String path = "D:\\Usuários\\Petter\\OneDrive - Fatec Centro Paula Souza\\Disciplinas\\Estrutura de Dados\\ManipulacaoArquivo";
		String arquivo = "entrada.txt";
		
		File arq = new File(path, arquivo);
		
		if(arq.exists())
			arq.delete();
		
		controller.create(path, arquivo);
		
		controller.read(path, arquivo);
		
//		for(int i = 0; i < 5; i++) {
//			producao.setId(BigInteger.valueOf(i + 1));
//			producao.setProduto("Produto " + (i + 1));
//			producao.setQuantidade((int)(100 + Math.random() * 901));
//			producao.setDataProducao(LocalDate.now());
//			producao.setHoraProducao(LocalTime.now());
//			producao.setCustoProducao((int)(1000 + Math.random() * 9001));
//			controller.insert(producao, path, arquivo);
//		}
//		
//		controller.read(path, arquivo);
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
