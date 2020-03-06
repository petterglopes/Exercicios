/*
Nome do Programa        : Lt01_EstSeq11
Objetivo                : Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq11
{
 public static void main(String args[])
    {             
        int raio = Integer.parseInt(JOptionPane.showInputDialog("INFORME O VALOR DO RAIO"));
                
        double perimetro = 2 * Math.PI * raio;
        
        JOptionPane.showMessageDialog(null, "O PERIMETRO É " + perimetro);
    }
}