package models;

/**
 *
 * @author Rodrigo Lima
 */
public class TabelaCPV {
    private String produto;
    private double CPV;

    public String getCampoProduto() {
        return produto;
    }

    public void setCampoProduto(String produto) {
        this.produto = produto;
    }

    public double getCampoCPV() {
        return CPV;
    }

    public void setCampoCPV(double CPV) {
        this.CPV = CPV;
    }

}