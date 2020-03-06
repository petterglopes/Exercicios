/*
Nome do Programa        : Lt01_EstRep36
Objetivo                : Cálculo série 1/1! + 1/2! + ... + 1/N!                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/
package o4_estrep;

import javax.swing.JOptionPane;

public class Lt01_ModFun36
{
    public static void main(String args[])
    {
        double c;
        c = Double.parseDouble(JOptionPane.showInputDialog("informe um numero inteiro."));
        c = FS(c);
        JOptionPane.showMessageDialog(null, "O resultado da série para o enésimo número é " + c);
    }
    
    static double FS(double s)
    {
        double n=0;
        double f;
        while (s >= 1)
        {
            f = s;
            n = n + (1 / Fat(s));
            s = f - 1;
        }
        return n;
}

    static double Fat(double f)
    {
        double c;
        c = f - 1;
        while (c > 1)
        {
            f = f * c;
            c = c - 1;
        }
        return f;
    }
}
