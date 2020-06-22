package controllers;

import models.TabelaDespesasFixas;

/**
 *
 * @author Rodrigo Lima
 */
public class DespesasFixasController {

    public TabelaDespesasFixas adicionarValor(String cDespesa, double valorDespesa, TabelaDespesasFixas d) {
        d.setCampoDespesaFixa(cDespesa);
        d.setCampoValorDespesaFixa(valorDespesa);
        return d;
    }
    
}
