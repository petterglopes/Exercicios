package p2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Metodo {

    public Livro[] cadastrar(Livro livros[]) throws IOException {
        
        String fileName = "livros";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < livros.length; i++) {
            livros[i] = new Livro();
            livros[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
            livros[i].categoria = Integer.parseInt(JOptionPane.showInputDialog("Categoria: "));
            livros[i].nomeDaCategoria = JOptionPane.showInputDialog(null, "Nome da categoria: ");
            livros[i].qtdEmprestado = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de vezes que foi emprestado: "));

            writer.write(Integer.toString(livros[i].codigo));
            writer.newLine();
            writer.write(Integer.toString(livros[i].categoria));
            writer.newLine();
            writer.write(livros[i].nomeDaCategoria);
            writer.newLine();
            writer.write(Integer.toString(livros[i].qtdEmprestado));
            writer.newLine();
        }
        writer.close();

        return livros;
    }

    public void mostrarMaisEmprestado(Livro[] livros) throws IOException{
        int qtdDoMaisEmprestado = livros[0].qtdEmprestado;

        for (int i = 1; i < livros.length; i++) {
            if (livros[i].qtdEmprestado > qtdDoMaisEmprestado) {
                qtdDoMaisEmprestado = livros[i].qtdEmprestado;
            }
        }
        String result = "Código do(s) livro(s) mais emprestado(s):\n";

        for (int i = 0; i < livros.length; i++) {
            if (livros[i].qtdEmprestado == qtdDoMaisEmprestado) {
                result += " - " + livros[i].codigo + " - ";
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }

    public void mostrarPorCategoria(Livro[] livros) throws IOException{
        for (int i = 0; i < livros.length - 1; i++) {
            for (int j = i + 1; i < livros.length; i++) {
                if (livros[i].categoria > livros[j].categoria) {
                    Livro livroAux = livros[i];
                    livros[i] = livros[j];
                    livros[j] = livroAux;
                }
            }
        }
        String result = "";
        int categoriaAtual = livros[0].categoria;
        String nomeCategoria = livros[0].nomeDaCategoria;
        int qtdCategoria = 1;

        for (int i = 1; i < livros.length; i++) {
            if (livros[i].categoria == categoriaAtual) {
                qtdCategoria++;
            } else {
                result += String.format("Categoria - %s: %d%n", nomeCategoria, qtdCategoria);
                categoriaAtual = livros[i].categoria;
                nomeCategoria = livros[i].nomeDaCategoria;
                qtdCategoria = 1;
            }
        }
        result += String.format("Categoria - %s: %d%n", nomeCategoria, qtdCategoria);

        JOptionPane.showMessageDialog(null, result);
    }
}
