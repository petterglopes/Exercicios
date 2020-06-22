package models;

/**
 *
 * @author Rodrigo Lima
 */
public class TabelaDespesasFixas {
    private String despesa;
    private double valorDespesa;

    public String getCampoDespesaFixa() {
        return despesa;
    }

    public void setCampoDespesaFixa(String despesa) {
        this.despesa = despesa;
    }

    public double getCampoValorDespesaFixa() {
        return valorDespesa;
    }

    public void setCampoValorDespesaFixa(Double valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

}
