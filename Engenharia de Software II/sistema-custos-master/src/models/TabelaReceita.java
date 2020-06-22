package models;

/**
 *
 * @author Rodrigo Lima
 */
public class TabelaReceita {
    private String produto;
    private int quantidadeV;
    private double precoUn;
    private double receitaT;

    public String getCampoProduto() {
        return produto;
    }

    public void setCampoProduto(String produto) {
        this.produto = produto;
    }

    public int getCampoQuantidadeV() {
        return quantidadeV;
    }

    public void setCampoQuantidadeV(int quantidadeV) {
        this.quantidadeV = quantidadeV;
    }
    
    public double getCampoPreco(){
        return precoUn;
    }
    
    public void setCampoPreco(Double precoUn){
        this.precoUn = precoUn;
    }
    
    public double getCampoReceitaT(){
        return receitaT;
    }
    
    public void setCampoReceitaT(double receitaT){
        this.receitaT = receitaT;
    }
 
}
