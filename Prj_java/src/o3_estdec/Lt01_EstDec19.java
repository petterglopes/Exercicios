/*
Nome do Programa        : Lt01_EstDec19
Objetivo                : Mostrar numero maior                      
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec19
{
    public static void main (String args[])
    {
        int a;
        int b;
                
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
        
        if(a > b)
            JOptionPane.showMessageDialog(null, "O maior valor é " + a + ".");
        else if(a < b)
            JOptionPane.showMessageDialog(null, "O maior valor é " + b + ".");
        else
            JOptionPane.showMessageDialog(null, "Os dois valores são iguais.");
    }
}