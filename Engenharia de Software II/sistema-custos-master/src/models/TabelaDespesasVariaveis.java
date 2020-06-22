package models;

/**
 *
 * @author Rodrigo Lima
 */
public class TabelaDespesasVariaveis {
    private String produto;
    private double valor;

    public String getCampoProduto() {
        return produto;
    }

    public void setCampoProduto(String produto) {
        this.produto = produto;
    }

    public double getCampoValor() {
        return valor;
    }

    public void setCampoValor(Double valor) {
        this.valor = valor;
    }
 
}
