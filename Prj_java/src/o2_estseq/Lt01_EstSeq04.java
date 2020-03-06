/*
Nome do Programa        : Lt01_EstSeq04
Objetivo                : Coletar a temperatura em Celcius e converter para Fahrenheit.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq04
{
 public static void main(String args[])
    {             
        double c = Double.parseDouble(JOptionPane.showInputDialog("INFORME A TEMPERATUARA EM GRAUS CELSIUS"));
                
        double f = (9 * c + 160) /5;
        
        JOptionPane.showMessageDialog(null, "A TEMPERATUARA EM GRAUS FAHRENHEIT É " + f);
    }
}
