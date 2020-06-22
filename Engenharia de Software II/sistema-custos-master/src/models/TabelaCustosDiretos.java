package models;

/**
 *
 * @author Rodrigo Lima
 */
public class TabelaCustosDiretos {
    private String produto;
    private double valorMP;
    private double valorMOD;
    private double valorE;
    private double total;

    public String getCampoProduto() {
        return produto;
    }

    public void setCampoProduto(String produto) {
        this.produto = produto;
    }

    public double getCampoValorMP() {
        return valorMP;
    }

    public void setCampoValorMP(double valorMP) {
        this.valorMP = valorMP;
    }

    public double getCampoValorMOD() {
        return valorMOD;
    }

    public void setCampoValorMOD(double valorMOD) {
        this.valorMOD = valorMOD;
    }

    public double getCampoValorE() {
        return valorE;
    }

    public void setCampoValorE(double valorE) {
        this.valorE = valorE;
    }

    public double getCampoValorTotal() {
        return total;
    }

    public void setCampoValorTotal(double total) {
        this.total = total;
    }

}

