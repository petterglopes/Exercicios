package p2;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws IOException {
        Livro[] livros = new Livro[2];
        Metodo m = new Metodo();

        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar livros\n2 - Mostrar livro(s) mais emprestado(s)\n3 - Mostrar quantidade por categoria\n9 - Fim"));

            switch (option) {
                case 1:
                    livros = m.cadastrar(livros);
                    break;
                case 2:
                    m.mostrarMaisEmprestado(livros);
                    break;
                case 3:
                    m.mostrarPorCategoria(livros);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao inválida!");
                    break;
            }
        } while (option != 9);
    }
}
