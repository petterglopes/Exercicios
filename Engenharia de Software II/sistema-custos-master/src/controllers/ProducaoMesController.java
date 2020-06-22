package controllers;

import models.TabelaProducaoMes;

/**
 *
 * @author Rodrigo Lima
 */
public class ProducaoMesController {

    public TabelaProducaoMes adicionarValor(String cProduto, int cQtdP, TabelaProducaoMes p) {
        p.setCampoProduto(cProduto);
        p.setCampoQuantidadeP(cQtdP);
        return p;
    }
    
}
