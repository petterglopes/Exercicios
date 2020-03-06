/*
Nome do Programa        : Lt01_EstSeq15
Objetivo                : Cálculo da hipotenusa                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq15
{
 public static void main(String args[])
    {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro cateto."));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo cateto."));
        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        JOptionPane.showMessageDialog(null,"A hipotenusa é igual a " + h);
    }
}
