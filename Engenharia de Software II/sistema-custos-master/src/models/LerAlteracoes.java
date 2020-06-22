package models;

import controllers.CustosDiretosController;
import controllers.CustosIndiretosController;
import controllers.DespesasFixasController;
import controllers.DespesasVariaveisController;
import controllers.ProducaoMesController;
import controllers.ReceitaController;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Rodrigo Lima
 */
public class LerAlteracoes {

    public TabelaReceita lerAlteracoesReceita(BufferedReader readerReceita, TabelaReceita r) throws IOException {
        ReceitaController rc = new ReceitaController();
        r = rc.adicionarValor((String) readerReceita.readLine(), (Integer.parseInt(readerReceita.readLine())), (Double.parseDouble(readerReceita.readLine())), (Double.parseDouble(readerReceita.readLine())), r);
        return r;
    }

    public TabelaProducaoMes lerAlteracoesProducao(BufferedReader readerProducao, TabelaProducaoMes p) throws IOException {
        ProducaoMesController pm = new ProducaoMesController();
        p = pm.adicionarValor((String) readerProducao.readLine(), (Integer.parseInt(readerProducao.readLine())), p);
        return p;
    }

    public TabelaCustosIndiretos lerAlteracoesCustosIndiretos(BufferedReader readerCustosIndiretos, TabelaCustosIndiretos ci) throws IOException{
        CustosIndiretosController cic = new CustosIndiretosController();
        ci = cic.adicionarValor((String) readerCustosIndiretos.readLine(), (Double.parseDouble(readerCustosIndiretos.readLine())), ci);
        return ci;
    }

    public TabelaCustosDiretos lerAlteracoesCustosDiretos(BufferedReader readerCustosDiretos, TabelaCustosDiretos cd) throws IOException {
        CustosDiretosController cdc = new CustosDiretosController();
        cd = cdc.adicionarValor((String) readerCustosDiretos.readLine(), cd, (Double.parseDouble(readerCustosDiretos.readLine())), (Double.parseDouble(readerCustosDiretos.readLine())), (Double.parseDouble(readerCustosDiretos.readLine())), (Double.parseDouble(readerCustosDiretos.readLine())));
        return cd;
    }

    public TabelaDespesasVariaveis lerAlteracoesDespesasVariaveis(BufferedReader readerDespesasVariaveis, TabelaDespesasVariaveis dv) throws IOException{
        DespesasVariaveisController dvc = new DespesasVariaveisController();
        dv = dvc.adicionarValor((String) readerDespesasVariaveis.readLine(), dv, (Double.parseDouble(readerDespesasVariaveis.readLine())), 1);
        return dv;
    }

    public TabelaDespesasFixas lerAlteracoesDespesasFixas(BufferedReader readerDespesasFixas, TabelaDespesasFixas df) throws IOException {
        DespesasFixasController dfc = new DespesasFixasController();
        df = dfc.adicionarValor((String) readerDespesasFixas.readLine(), (Double.parseDouble(readerDespesasFixas.readLine())), df);
        return df;
    }
    
}
