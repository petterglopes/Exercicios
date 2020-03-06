/*
Nome do Programa        : Lt01_EstSeq09
Objetivo                : Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq09
{
 public static void main(String args[])
    {             
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("INFORME O PRIMEIRO VALOR"));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("INFORME O SEGUNDO VALOR"));
                
        double soma = Math.pow(v1, 2) + Math.pow(v2, 2);
        
        JOptionPane.showMessageDialog(null, "A SOMA DOS QUADRADOS É " + soma);
    }
}