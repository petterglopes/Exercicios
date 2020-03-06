/*
Nome do Programa        : Lt01_EstRep34
Objetivo                : Tabuada multiplicaçao                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/
package o4_estrep;

import javax.swing.JOptionPane;

public class Lt01_EstRep34
{
    public static void main(String args[])
    {
        int n, c, r;
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro de 1 a 10"));
        for (c = 1; c <= 10; c++)
        {
            r = n * c;
            System.out.println(c + " x " + n + " = " + r);
        }
    }
}