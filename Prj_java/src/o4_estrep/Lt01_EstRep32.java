/*
Nome do Programa        : Lt01_EstRep32
Objetivo                : Cálculo Fatorial                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/
package o4_estrep;

import javax.swing.JOptionPane;

public class Lt01_EstRep32 
{
    public static void main(String args[])
    {
        int n, c;
        n = Integer.parseInt(JOptionPane.showInputDialog("informe um numero inteiro."));
        c = n - 1;
        while (c > 1)
        {
            n = n * c;
            c = c - 1;
        }
        JOptionPane.showMessageDialog(null, "O fatorial é " + n + ".");
    }
}