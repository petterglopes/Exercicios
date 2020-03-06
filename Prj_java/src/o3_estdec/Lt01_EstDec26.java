/*
Nome do Programa        : Lt01_EstDec26
Objetivo                : Verifique e mostre se o maior número é múltiplo do menor.                      
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec26
{
    public static void main( String args[])
    {
        int a;
        int b;
        int c;
        int d;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor."));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor."));
        
        if (a == b)
        {
            JOptionPane.showMessageDialog(null, "Os valores são iguais. Por favor insira valores diferentes");
        }
            else
            {
                if (a > b)
                {
                    c = (a / b);
                    c = (c * b);
                    if (c == a)
                    {
                        JOptionPane.showMessageDialog(null, a + " é múltiplo de " + b);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, a + " não é múltiplo de " + b);
                    }
                }
                else
                {
                    d = (b / a);
                    d = (d * a);
                    if (d == b)
                    {
                        JOptionPane.showMessageDialog(null, b + " é múltiplo de " + a);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, b + " não é múltiplo de " + a);
                    }
                }
            }
    }
}
