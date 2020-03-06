/*
Nome do Programa        : Lt01_EstSeq05
Objetivo                : Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq05 
{
 public static void main(String args[])
    {             
        int a = Integer.parseInt(JOptionPane.showInputDialog("INFORME O COEFICIENTE A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("INFORME O COEFICIENTE B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("INFORME O COEFICIENTE C"));
                
        double r1 =(-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double r2 =(-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        
        JOptionPane.showMessageDialog(null, "AS RAIZES REAIS SÃO " + r1 + " E " + r2);
    }
}