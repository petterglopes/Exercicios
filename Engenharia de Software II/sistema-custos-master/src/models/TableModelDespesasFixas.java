package models;

import view.Custos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rodrigo Lima
 */
public class TableModelDespesasFixas extends AbstractTableModel{

    public List<TabelaDespesasFixas> dados = new ArrayList<>();
    
    private String[] colunas = {"Despesa", "(R$)Valor"};
    
    public String getColumnName(int column){
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getCampoDespesaFixa();
            case 1:
                return dados.get(linha).getCampoValorDespesaFixa();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linha).setCampoDespesaFixa((String) valor);
                    break;
            case 1:
                dados.get(linha).setCampoValorDespesaFixa(Double.parseDouble((String) valor));
                    break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    public void addRow(TabelaDespesasFixas c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}

