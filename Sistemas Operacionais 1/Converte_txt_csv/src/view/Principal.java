package view;

import java.io.IOException;

import controller.Converte;

public class Principal {

	public static void main(String[] args) {

		Converte converte = new Converte();
		String path = "D:\\Usuários\\Petter\\OneDrive - Fatec Centro Paula Souza\\Disciplinas\\SO1\\Manipulacao_Arquivo";
		String nome = "relatorio.txt";
		try {
			converte.converterTxtCsv(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Arquivo convertido");
	}

}
