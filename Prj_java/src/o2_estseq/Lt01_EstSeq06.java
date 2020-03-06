/*
Nome do Programa        : Lt01_EstSeq06
Objetivo                : Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq06
{
    public static void main(String args[])
    {             
        int x = Integer.parseInt(JOptionPane.showInputDialog("INFORME O VALOR DE X"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("INFORME O VALOR DE Y"));
        
        x = x + y;
        y = x - y;
        x = x - y;
        
        JOptionPane.showMessageDialog(null, "X É = " + x + " E Y É = " + y);
    }
}