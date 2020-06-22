/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.TabelaCPV;
import models.TabelaCustoAbsorcao;
import models.TabelaDRE;
import models.TableModelCPV;
import models.TableModelCustoAbsorcao;
import models.TableModelDRE;

/**
 *
 * @author Rodrigo Lima
 */
public class Detalhes extends javax.swing.JFrame {
    
//    private Logger log = Logger.getLogger(name)
    /**
     * Creates new form Detalhes
     */
    TableModelCustoAbsorcao tableModelCA = new TableModelCustoAbsorcao();
    TableModelCPV tableModelCPV = new TableModelCPV();
    TableModelDRE tableModelDRE = new TableModelDRE();
    
    private String produto[] = new String[0];
    private double valores[][] = new double[0][0];
    private int qtdV[] = new int[0];
    private double dreV[] = new double[0];
    
//    public Detalhes() {
//        super();
//    }
 
    
    public Detalhes (final String[] produto, final double[][] valores, final int[] qtdV, final double[] dreV) throws IOException{
        this.produto = produto;
        this.valores = valores;
        this.qtdV = qtdV;
        this.dreV = dreV;
        initComponents();
        this.setTitle("Detalhes");
        ImageIcon icone = new ImageIcon("icone.png");
        setIconImage(icone.getImage());
        tabelaCustoAbsorcao.setModel(tableModelCA);
        tabelaCustoAbsorcao.getColumnModel().getColumn(1).setPreferredWidth(5);
        tabelaCustoAbsorcao.getColumnModel().getColumn(2).setPreferredWidth(5);
        tabelaCustoAbsorcao.getColumnModel().getColumn(3).setPreferredWidth(25);
        tabelaCustoAbsorcao.getColumnModel().getColumn(4).setPreferredWidth(5);
        tabelaCustoAbsorcao.getColumnModel().getColumn(5).setPreferredWidth(5);
        tabelaCPV.setModel(tableModelCPV);
        tabelaCPV.getColumnModel().getColumn(1).setPreferredWidth(5);
        tabelaDRE.setModel(tableModelDRE);
        tabelaDRE.getColumnModel().getColumn(1).setPreferredWidth(5);
        adicionarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaCPV = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaCustoAbsorcao = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaDRE = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Custo total por absorção");

        tabelaCPV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tabelaCPV);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DRE custeio por absorção");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Custo do produto vendido");

        tabelaCustoAbsorcao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tabelaCustoAbsorcao);

        tabelaDRE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaDRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDREMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tabelaDRE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("(Clique na tabela para alterar a % de impostos)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaDREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDREMouseClicked
        try{
            double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem (%) de impostos"));
            tableModelDRE.removeRow(0);
            tableModelDRE.removeRow(0);
            tableModelDRE.removeRow(0);
            tableModelDRE.removeRow(0);
            tableModelDRE.removeRow(0);
            tableModelDRE.removeRow(0);
            tableModelDRE.removeRow(0);
            dreV[1] = dreV[0] * (porcentagem / 100);
            dreV[2] = dreV[0] - dreV[1];
            dreV[4] = dreV[2] - dreV[3];
            dreV[6] = dreV[4] - dreV[5];
            String campo[] = {"Receita de Vendas", "(-) Imposto sobre vendas", "(=) Receita Líquida", "(-) Custo do Produto Vendido", "(=) Lucro Bruto", "(-) Despesas", "(=) Lucro Líquido"};
            if (dreV[6] < 0){
                campo[6] = "(=) Prejuízo Líquido";
            }
            for(int i = 0; i < campo.length; i++){
                TabelaDRE dre = new TabelaDRE();
                dre.setCampoCampo(campo[i]);
                dre.setCampoValor(dreV[i]);
                tableModelDRE.addRow(dre);
            }
        } catch (NumberFormatException ex) { 
            JOptionPane.showMessageDialog(null, "Apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex){
            return;
        }
    }//GEN-LAST:event_tabelaDREMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Detalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalhes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Detalhes(null, null, null, null).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Detalhes.class.getName()).info(ex.getMessage()); //.log(Level.SEVERE, null, ex);                    
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tabelaCPV;
    private javax.swing.JTable tabelaCustoAbsorcao;
    private javax.swing.JTable tabelaDRE;
    // End of variables declaration//GEN-END:variables

    private void adicionarValores() throws IOException {
        for(int i = 0; i < produto.length; i++){
            TabelaCustoAbsorcao ca = new TabelaCustoAbsorcao();
            ca.setCampoProduto(produto[i]);
            ca.setCampoCustosDiretos(valores[i][0]);
            ca.setCampoPorcentagem(valores[i][1]);
            ca.setCampoCustosIndiretos(valores[i][2]);
            ca.setCampoCustoTotal(valores[i][3]);
            ca.setCampoCustoUn(valores[i][4]);
            tableModelCA.addRow(ca);
            
            TabelaCPV cpv = new TabelaCPV();
            cpv.setCampoProduto(produto[i]);
            BigDecimal bd = new BigDecimal(valores[i][4] * qtdV[i]).setScale(2, RoundingMode.HALF_EVEN);
            cpv.setCampoCPV(bd.doubleValue());
            tableModelCPV.addRow(cpv);            
        }
        String campo[] = {"Receita de Vendas", "(-) Imposto sobre vendas", "(=) Receita Líquida", "(-) Custo do Produto Vendido", "(=) Lucro Bruto", "(-) Despesas", "(=) Lucro Líquido"};
        if (dreV[6] < 0){
            campo[6] = "(=) Prejuízo Líquido";
        }
        for(int i = 0; i < campo.length; i++){
            TabelaDRE dre = new TabelaDRE();
            dre.setCampoCampo(campo[i]);
            dre.setCampoValor(dreV[i]);
            tableModelDRE.addRow(dre);
        }
    }

}