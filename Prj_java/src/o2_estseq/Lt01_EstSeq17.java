/*
Nome do Programa        : Lt01_EstSeq17
Objetivo                : Cálculo de consumo de combustivel                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq17
{
 public static void main(String args[])
    {
        double tp, vm, l;
        
        tp = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo total de viagem."));
        vm = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média."));
        
        l = ((tp * vm) / 12);
        
        JOptionPane.showMessageDialog(null,"A quantidade de combustivel consumida é " + l + "L");
    }
}