package models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author Rodrigo Lima
 */
public class GravarAlteracoes {

    public void gravarAlteracoes(JTable tabelaReceita, JTable tabelaProducaoMes, JTable tabelaCustosIndiretos, JTable tabelaCustosDiretos, JTable tabelaDespesasVariaveis, JTable tabelaDespesasFixas) throws IOException {
        String fileReceita = "gravacaoReceita.txt";
        BufferedWriter writerReceita = new BufferedWriter(new FileWriter(fileReceita));
        
        String fileProducao = "gravacaoProducao.txt";
        BufferedWriter writerProducao = new BufferedWriter(new FileWriter(fileProducao));
        
        String fileCustosIndiretos = "gravacaoCustosIndiretos.txt";
        BufferedWriter writerCustosIndiretos = new BufferedWriter(new FileWriter(fileCustosIndiretos));
        
        String fileCustosDiretos = "gravacaoCustosDiretos.txt";
        BufferedWriter writerCustosDiretos = new BufferedWriter(new FileWriter(fileCustosDiretos));
        
        String fileDespesasVariaveis = "gravacaoDespesasVariaveis.txt";
        BufferedWriter writerDespesasVariaveis = new BufferedWriter(new FileWriter(fileDespesasVariaveis));
        
        String fileDespesasFixas = "gravacaoDespesasFixas.txt";
        BufferedWriter writerDespesasFixas = new BufferedWriter(new FileWriter(fileDespesasFixas));
        
        
        for (int i=0; i<tabelaReceita.getRowCount(); i++) {
            writerReceita.write((String) tabelaReceita.getValueAt(i, 0));
            writerReceita.newLine();
            Object valueAt = tabelaReceita.getValueAt(i, 1);
            int value = (int) valueAt;
            writerReceita.write(String.valueOf(value));
            writerReceita.newLine();
            Object valueAt2 = tabelaReceita.getValueAt(i, 2);
            double value2 = (double) valueAt2;
            writerReceita.write(String.valueOf(value2));
            writerReceita.newLine();
            Object valueAt3 = tabelaReceita.getValueAt(i, 3);
            double value3 = (double) valueAt3;
            writerReceita.write(String.valueOf(value3));
            writerReceita.newLine();
        }
        
        writerReceita.close();
        
        for (int i=0; i<tabelaProducaoMes.getRowCount(); i++) {
            writerProducao.write((String) tabelaProducaoMes.getValueAt(i, 0));
            writerProducao.newLine();
            Object valueAt = tabelaProducaoMes.getValueAt(i, 1);
            int value = (int) valueAt;
            writerProducao.write(String.valueOf(value));
            writerProducao.newLine();
           
        }
        
        writerProducao.close();
        
        for (int i=0; i<tabelaCustosIndiretos.getRowCount(); i++) {
            writerCustosIndiretos.write((String) tabelaCustosIndiretos.getValueAt(i, 0));
            writerCustosIndiretos.newLine();
            Object valueAt = tabelaCustosIndiretos.getValueAt(i, 1);
            double value = (double) valueAt;
            writerCustosIndiretos.write(String.valueOf(value));
            writerCustosIndiretos.newLine();
           
        }
        
        writerCustosIndiretos.close();
        
        for (int i=0; i<tabelaCustosDiretos.getRowCount(); i++) {
            writerCustosDiretos.write((String) tabelaCustosDiretos.getValueAt(i, 0));
            writerCustosDiretos.newLine();
            Object valueAt = tabelaCustosDiretos.getValueAt(i, 1);
            double value = (double) valueAt;
            writerCustosDiretos.write(String.valueOf(value));
            writerCustosDiretos.newLine();
            Object valueAt2 = tabelaCustosDiretos.getValueAt(i, 2);
            double value2 = (double) valueAt2;
            writerCustosDiretos.write(String.valueOf(value2));
            writerCustosDiretos.newLine();
            Object valueAt3 = tabelaCustosDiretos.getValueAt(i, 3);
            double value3 = (double) valueAt3;
            writerCustosDiretos.write(String.valueOf(value3));
            writerCustosDiretos.newLine();
            Object valueAt4 = tabelaCustosDiretos.getValueAt(i, 4);
            double value4 = (double) valueAt4;
            writerCustosDiretos.write(String.valueOf(value4));
            writerCustosDiretos.newLine();
           
        }
        
        writerCustosDiretos.close();
        
        for (int i=0; i<tabelaDespesasVariaveis.getRowCount(); i++) {
            writerDespesasVariaveis.write((String) tabelaDespesasVariaveis.getValueAt(i, 0));
            writerDespesasVariaveis.newLine();
            Object valueAt = tabelaDespesasVariaveis.getValueAt(i, 1);
            double value = (double) valueAt;
            writerDespesasVariaveis.write(String.valueOf(value));
            writerDespesasVariaveis.newLine();
           
        }
        
        writerDespesasVariaveis.close();
        
        for (int i=0; i<tabelaDespesasFixas.getRowCount(); i++) {
            writerDespesasFixas.write((String) tabelaDespesasFixas.getValueAt(i, 0));
            writerDespesasFixas.newLine();
            Object valueAt = tabelaDespesasFixas.getValueAt(i, 1);
            double value = (double) valueAt;
            writerDespesasFixas.write(String.valueOf(value));
            writerDespesasFixas.newLine();
           
        }
        
        writerDespesasFixas.close();

    }
    
}
