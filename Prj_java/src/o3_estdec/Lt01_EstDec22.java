/*
Nome do Programa        : Lt01_EstDec22
Objetivo                : Valores em ordem crescente                      
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec22
{
    public static void main (String args[])
    {
    int a, b;
    a = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º valor."));
    b = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º  valor."));
    if (a == b)
        JOptionPane.showMessageDialog(null, "Os valores são iguais. Informe valores diferentes.");
        else if (a < b)
            JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " + a + " e " + b + ".");
            else
                JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " + b + " e " + a + ".");
        
    }
}