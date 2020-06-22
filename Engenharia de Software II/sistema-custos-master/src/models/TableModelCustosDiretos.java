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
public class TableModelCustosDiretos extends AbstractTableModel{

    public List<TabelaCustosDiretos> dados = new ArrayList<>();
    
    private String[] colunas = {"Produto/Modelo", "(R$)Matéria Prima", "(R$)Mão de Obra Direta", "(R$)Embalagem", "(R$)Total"};
    
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
                return dados.get(linha).getCampoProduto();
            case 1:
                return dados.get(linha).getCampoValorMP();
            case 2:
                return dados.get(linha).getCampoValorMOD();
            case 3:
                return dados.get(linha).getCampoValorE();
            case 4:
                return dados.get(linha).getCampoValorTotal();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linha).setCampoProduto((String) valor);
                    break;
            case 1:
                dados.get(linha).setCampoValorMP(Double.parseDouble((String) valor));
                    break;
            case 2:
                dados.get(linha).setCampoValorMOD(Double.parseDouble((String) valor));
                    break;
            case 3:
                dados.get(linha).setCampoValorE(Double.parseDouble((String) valor));
                    break;
            case 4:
                dados.get(linha).setCampoValorTotal(Double.parseDouble((String) valor));
                    break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    public void addRow(TabelaCustosDiretos c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}

