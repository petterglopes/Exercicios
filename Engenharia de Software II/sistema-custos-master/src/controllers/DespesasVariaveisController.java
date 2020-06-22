package controllers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import models.TabelaDespesasVariaveis;

/**
 *
 * @author Rodrigo Lima
 */
public class DespesasVariaveisController {

    public TabelaDespesasVariaveis adicionarValor(String cProduto, TabelaDespesasVariaveis d, double despesasVariaveis, int qtdV) {
        d.setCampoProduto(cProduto);
        BigDecimal bd = new BigDecimal(despesasVariaveis * qtdV).setScale(2, RoundingMode.HALF_EVEN);
        d.setCampoValor(bd.doubleValue());
        return d;
    }
    
}
