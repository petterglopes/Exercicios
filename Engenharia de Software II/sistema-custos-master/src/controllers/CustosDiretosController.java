package controllers;

import models.TabelaCustosDiretos;

/**
 *
 * @author Rodrigo Lima
 */
public class CustosDiretosController {

    public TabelaCustosDiretos adicionarValor(String cProduto, TabelaCustosDiretos c, double materiaPrima, double maoDeObraD, double embalagem, double totalCd) {
        c.setCampoProduto(cProduto);
        c.setCampoValorMP(materiaPrima);
        c.setCampoValorMOD(maoDeObraD);
        c.setCampoValorE(embalagem);
        c.setCampoValorTotal(totalCd);
        return c;
    }

    
}
