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
import java.util.Queue;

public class ProducaoController implements IObjetoController{

	@Override
	public void create(String path, String arquivo)throws IOException {
		File dir = new File(path);
		File arq = new File(path, arquivo);
		if(dir.exists() && dir.isDirectory()) {
			String conteudo = "ID;Produto;quantidade;dataProducao;horaProducao;custoProducao;";
			List <String> listaDeObjeto = new LinkedList<String>();
			listaDeObjeto.add(conteudo);
			FileWriter fileWriter = new FileWriter(arq, arq.exists());
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.write(listaDeObjeto.get(1));
			printWriter.flush();
			printWriter.close();
			fileWriter.close();
		}else {
			throw new IOException("Diretório invalido ou arquivo já existe");
		}
	}
	
	@Override
	public void read(String path, String arquivo)throws IOException {
		File dir = new File(path);
		File arq = new File(path, arquivo);
		if(dir.exists() && dir.isDirectory()) {
			FileInputStream fluxo = new FileInputStream(arq);
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);
            buffer.readLine();
            List <String> listaDeObjeto = new LinkedList<String>();
            String linha = "";
            while(linha != null) {
            	linha = buffer.readLine();
            	listaDeObjeto.add(linha);
            }
            buffer.close();
            leitor.close();
            fluxo.close();
            System.out.println(listaDeObjeto.toString());
		}else {
			throw new IOException("Diretório invalido ou arquivo já existe");
		}
		
	}

	@Override
	public void update(Producao producao, String path, String arquivo)throws IOException {
		
	}

	@Override
	public void delete(BigInteger id, String path, String arquivo)throws IOException {
		
	}
}
