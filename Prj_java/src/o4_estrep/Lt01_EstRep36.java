/*
Nome do Programa        : Lt01_EstRep36
Objetivo                : Cálculo série 1/1! + 1/2! + ... + 1/N!                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/
package o4_estrep;

import javax.swing.JOptionPane;

public class Lt01_EstRep36
{
    public static void main(String args[])
    {
        double c;
        double c1;
        double n=0;
        double f;
        c = Double.parseDouble(JOptionPane.showInputDialog("informe um numero inteiro."));
        while (c >= 1)
        {
            f = c;
            c1 = f - 1;
            while (c1 > 1)
            {
                f = f * c1;
                c1 = c1 - 1;
            }
            n = n + (1 / f);
            c = c - 1;
        }
        JOptionPane.showMessageDialog(null, "O resultado da série para o enésimo número é " + n);
    }
}
