/*
Nome do Programa        : Lt01_EstSeq13
Objetivo                : Cálculo de durabildade do alimento                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq13
{
 public static void main(String args[])
    {             
        double q = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de alimento em Kg"));
                        
        q = (q / 0.05);
        
        JOptionPane.showMessageDialog(null, "O alimento durará por " + q + " dias");
    }
}