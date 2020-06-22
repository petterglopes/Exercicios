package models;

/**
 *
 * @author Rodrigo Lima
 */
public class TabelaCustosIndiretos {
    private String custo;
    private double valorCusto;

    public String getCampoCustoIndireto() {
        return custo;
    }

    public void setCampoCustoIndireto(String custo) {
        this.custo = custo;
    }

    public double getCampoValorCustoIndireto() {
        return valorCusto;
    }

    public void setCampoValorCustoIndireto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

}

