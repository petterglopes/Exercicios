/*
Nome do Programa        : Lt01_EstSeq10
Objetivo                : Receba 2 números reais. Calcule e mostre a diferença desses valores.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq10
{
 public static void main(String args[])
    {             
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("INFORME O PRIMEIRO VALOR"));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("INFORME O SEGUNDO VALOR"));
                
        double diferenca = Math.sqrt(Math.pow(v1 - v2, 2));
        
        JOptionPane.showMessageDialog(null, "A DIFERENÇA É " + diferenca);
    }
}