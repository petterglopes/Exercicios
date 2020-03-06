/*
Nome do Programa        : Lt01_EstRep35
Objetivo                : Soma Impares                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/
package o4_estrep;

import javax.swing.JOptionPane;

public class Lt01_EstRep35
{
    public static void main(String args[])
    {
        int a, b, c = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ssegundo valor:"));
        if (a > b)
        {
            while (a > b)
            {
                if (b % 2 == 0)
                {
                    b = b + 1;
                    c = c + b;
                    b = b + 1;
                }
                else
                {
                    c = c + b;
                    b = b + 1;
                }
            }
            JOptionPane.showMessageDialog(null,"A soma dos numeros impares é " + c);
        }
        else if (b > a)
        {
            while (b > a)
            {
                if (a % 2 == 0)
                {
                    a = a + 1;
                    c = c + a;
                    a = a + 1;
                }
                else
                {
                    c = c + a;
                    a = a + 1;
                }
            }
            JOptionPane.showMessageDialog(null,"A soma dos numeros impares é " + c);
        }
        else
        JOptionPane.showMessageDialog(null,"insira numeros diferentes");    
    }
}
