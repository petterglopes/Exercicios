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
public class TableModelCustoAbsorcao extends AbstractTableModel{

    public List<TabelaCustoAbsorcao> dados = new ArrayList<>();
    
    private String[] colunas = {"Produto/Modelo", "(R$)Custos Diretos", "%", "(R$)Custos Indiretos", "(R$)Custo Total", "(R$)Custo Unitário"};
    
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
                return dados.get(linha).getCampoCustosDiretos();
            case 2:
                return dados.get(linha).getCampoPorcentagem();
            case 3:
                return dados.get(linha).getCampoCustosIndiretos();
            case 4:
                return dados.get(linha).getCampoCustoTotal();
            case 5:
                return dados.get(linha).getCampoCustoUn();
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
                dados.get(linha).setCampoCustosDiretos(Double.parseDouble((String) valor));
                    break;
            case 2:
                dados.get(linha).setCampoPorcentagem(Double.parseDouble((String) valor));
                    break;
            case 3:
                dados.get(linha).setCampoCustosIndiretos(Double.parseDouble((String) valor));
                    break;
            case 4:
                dados.get(linha).setCampoCustoTotal(Double.parseDouble((String) valor));
                    break;
            case 5:
                dados.get(linha).setCampoCustoUn(Double.parseDouble((String) valor));
                    break;
        }
        
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    public void addRow(TabelaCustoAbsorcao c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
}

