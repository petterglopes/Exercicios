/*
Nome do Programa        : Lt01_EstDec18
Objetivo                : Cálculo da diferença                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec18
{
    public static void main (String args[])
    {
        int a;
        int b;
        int d;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
        
        if(a < b)
            d = b - a;
        else
            d = a - b;
        
        JOptionPane.showMessageDialog(null, "A diferença entre os valores é " + d);
    }
}
