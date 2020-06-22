package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Converte {

	public void converterTxtCsv(String path, String nome) throws IOException {
		File arqTxt = new File(path, nome);
		File arqCsv = new File(path, nome.replace(".txt", ".csv"));
		File dir = new File(path);
		if (dir.exists() && dir.isDirectory()) {
			if (arqTxt.exists()) {
				FileInputStream fluxo = new FileInputStream(arqTxt);
				InputStreamReader leitor = new InputStreamReader(fluxo, "UTF-8");
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String conteudo = "";
				while (linha != null) {
					conteudo += (linha.replace(" ", ";") + "\n");
					linha = buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
				FileWriter fileWriter = new FileWriter(arqCsv);
				PrintWriter print = new PrintWriter(fileWriter);
				print.write(conteudo);
				print.flush();
				print.close();
				fileWriter.close();
			}else {
				throw new IOException("Arquivo não existe");
			}
		}else {
			throw new IOException("Diretório inválido");
		}
	}
}
