package view;

import javax.swing.JOptionPane;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ArquivosController();
		String path = "D:\\Usuários\\Petter\\OneDrive - Fatec Centro Paula Souza\\Disciplinas\\SO1\\Manipulacao_Arquivo";
		String arquivo = "Registro.csv";
		
		try {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código"));
			String nome = JOptionPane.showInputDialog(null, "Digite o nome");
			String email = JOptionPane.showInputDialog(null, "Digite o e-mail");			
			arqCont.insereCadastro(path, arquivo, codigo, nome, email);
			arqCont.imprimeCadastro(path, arquivo, codigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
