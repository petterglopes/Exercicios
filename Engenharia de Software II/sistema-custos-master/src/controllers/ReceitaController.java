package controllers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import models.TabelaReceita;

/**
 *
 * @author Rodrigo Lima
 */
public class ReceitaController {

    public TabelaReceita adicionarValor(String cProduto, int quantidadeV, double preco, double totalR, TabelaReceita r) {
        r.setCampoProduto(cProduto);
        r.setCampoQuantidadeV(quantidadeV);
        r.setCampoPreco(preco);
        BigDecimal bd = new BigDecimal(quantidadeV * preco).setScale(2, RoundingMode.HALF_EVEN);
        r.setCampoReceitaT(bd.doubleValue());
        return r;
    }
    
}
