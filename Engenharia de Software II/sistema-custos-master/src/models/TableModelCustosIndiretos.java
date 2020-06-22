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
public class TableModelCustosIndiretos extends AbstractTableModel{

    public List<TabelaCustosIndiretos> dados = new ArrayList<>();
    
    private String[] colunas = {"Custo", "(R$)Valor"};
    
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
                return dados.get(linha).getCampoCustoIndireto();
            case 1:
                return dados.get(linha).getCampoValorCustoIndireto();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linha).setCampoCustoIndireto((String) valor);
                    break;
            case 1:
                dados.get(linha).setCampoValorCustoIndireto(Double.parseDouble((String) valor));
                    break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    public void addRow(TabelaCustosIndiretos c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}

