package controllers;

import models.TabelaCustosIndiretos;

/**
 *
 * @author Rodrigo Lima
 */
public class CustosIndiretosController {

    public TabelaCustosIndiretos adicionarValor(String cCusto, double valorCusto, TabelaCustosIndiretos c) {
        c.setCampoCustoIndireto(cCusto);
        c.setCampoValorCustoIndireto(valorCusto);
        return c;
    }
    
}
