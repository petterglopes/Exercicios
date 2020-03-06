/*
Nome do Programa        : Lt01_EstRep33
Objetivo                : Cálculo série                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/
package o4_estrep;

import javax.swing.JOptionPane;

public class Lt01_EstRep33
{
    public static void main(String args[])
    {
        double n=0;
        double c;
        
        c = Double.parseDouble(JOptionPane.showInputDialog("informe um numero inteiro."));
        
	while (c >= 1)
        {
            n = n + (1 / c);
            c = c - 1;
        }
        
        JOptionPane.showMessageDialog(null, "O resultado da série para o enésimo número é " + n);
    }
}