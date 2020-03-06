/*
Nome do Programa        : Lt01_EstSeq16
Objetivo                : Cálculo de salário a receber                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq16
{
 public static void main(String args[])
    {
        double qh, vh, pd, sl;
        int nd;
        qh = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhada."));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora."));
        pd = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto."));
        nd = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de dependentes."));
        sl = (qh * vh * (1 - pd / 100) + nd * 100);
        
        JOptionPane.showMessageDialog(null,"O salário a ser recebido é " + sl);
    }
}
