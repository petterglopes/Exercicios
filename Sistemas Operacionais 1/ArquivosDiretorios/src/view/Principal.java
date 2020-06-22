package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
        IArquivosController arqCont = new ArquivosController();
        String dirWin = "C:\\Windows";
        String path = "D:\\Usuários\\Petter\\OneDrive - Fatec Centro Paula Souza\\Disciplinas\\SO1\\Manipulacao_Arquivo";
        String nome = "relatorio.txt";
        
        try {
            arqCont.readDir(dirWin);
//            arqCont.createFile(path, nome);
//            arqCont.readFile(path, nome);
            arqCont.openFile(path, nome);
        } catch (IOException e) {
            e.printStackTrace();
        }
	} 

}
