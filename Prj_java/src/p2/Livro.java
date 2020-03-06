package p2;

public class Livro {

    int codigo;
    int categoria;
    String nomeDaCategoria;
    int qtdEmprestado;

    public Livro() {
        this(0, 0, "", 0);
    }

    public Livro(int cod, int cat, String nomeDaCat, int qtdEmpr) {
        codigo = cod;
        categoria = cat;
        nomeDaCategoria = nomeDaCat;
        qtdEmprestado = qtdEmpr;
    }
}
