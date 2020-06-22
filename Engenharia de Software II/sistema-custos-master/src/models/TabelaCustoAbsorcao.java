package models;

/**
 *
 * @author Rodrigo Lima
 */
public class TabelaCustoAbsorcao {
    private String produto;
    private double custosDiretos;
    private double porcentagem;
    private double custosIndiretos;
    private double custoTotal;
    private double custoUn;

    public String getCampoProduto() {
        return produto;
    }

    public void setCampoProduto(String produto) {
        this.produto = produto;
    }

    public double getCampoCustosDiretos() {
        return custosDiretos;
    }

    public void setCampoCustosDiretos(Double custosDiretos) {
        this.custosDiretos = custosDiretos;
    }
    
    public double getCampoPorcentagem() {
        return porcentagem;
    }
    
    public void setCampoPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }
    
    public double getCampoCustosIndiretos() {
        return custosIndiretos;
    }
    
    public void setCampoCustosIndiretos(Double custosIndiretos) {
        this.custosIndiretos = custosIndiretos;
    }
    
    public double getCampoCustoTotal() {
        return custoTotal;
    }
    
    public void setCampoCustoTotal(Double custoTotal) {
        this.custoTotal = custoTotal;
    }
    
    public double getCampoCustoUn() {
        return custoUn;
    }
    
    public void setCampoCustoUn(Double custoUn) {
        this.custoUn = custoUn;
    }

}
