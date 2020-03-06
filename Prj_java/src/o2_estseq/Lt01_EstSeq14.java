/*
Nome do Programa        : Lt01_EstSeq14
Objetivo                : Cálculo do ângulo do triângulo                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq14
{
 public static void main(String args[])
    {             
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro ângulo em graus."));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo ângulo em graus."));
                
        a = (180 - a - b);
        
        JOptionPane.showMessageDialog(null, "O ângulo faltante é de " + a + " graus");
    }
}
