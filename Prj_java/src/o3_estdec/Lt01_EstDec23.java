/*
Nome do Programa        : Lt01_EstDec23
Objetivo                : Ordenar 4 valores                      
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec23
{
    public static void main (String args[])
    {
    int a, b, c, d;
    a = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º valor."));
    b = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º  valor."));
    c = Integer.parseInt(JOptionPane.showInputDialog("Informe o 3º  valor."));
    if (a < b && b < c)
    {
        d = Integer.parseInt(JOptionPane.showInputDialog("Informe o 4º  valor."));
        if (d > c)
            JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " + a + ", " + b + ", " + c + " e " + d + ".");
                    else if(d > b)
                    JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " + a + ", " + b + ", " + d + " e " + c + ".");
                        else if (d > a)
                        JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " + a + ", " + d + ", " + b + " e " + c + ".");
                            else
                            JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " + d + ", " + a + ", " + b + " e " + c + ".");
    }
    else
	JOptionPane.showMessageDialog(null, "Os 3 primeiros valores não foram inseridos em ordem crescente.");
    }
}
