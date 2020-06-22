package models;

import controllers.ProducaoMesController;

/**
 *
 * @author Rodrigo Lima
 */
public class TabelaProducaoMes {
    private String produto;
    private int quantidadeP;

    public String getCampoProduto() {
        return produto;
    }

    public void setCampoProduto(String produto) {
        this.produto = produto;
    }

    public int getCampoQuantidadeP() {
        return quantidadeP;
    }

    public void setCampoQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }
 
}