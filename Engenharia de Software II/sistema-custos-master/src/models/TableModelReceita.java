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
public class TableModelReceita extends AbstractTableModel{

    public List<TabelaReceita> dados = new ArrayList<>();
    
    private String[] colunas = {"Produto/Modelo", "Qtd Vendida", "(R$)Preço de Venda Unitário", "(R$)Receita Total"};
    
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
                return dados.get(linha).getCampoQuantidadeV();
            case 2:
                return dados.get(linha).getCampoPreco();
            case 3:
                return dados.get(linha).getCampoReceitaT();
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
                dados.get(linha).setCampoQuantidadeV(Integer.parseInt((String) valor));
                    break;
            case 2:
                dados.get(linha).setCampoPreco(Double.parseDouble((String) valor));
                    break;
            case 3:
                dados.get(linha).setCampoReceitaT(Double.parseDouble((String) valor));
                    break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    public void addRow(TabelaReceita c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}
