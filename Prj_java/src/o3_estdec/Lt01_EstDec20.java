/*
Nome do Programa        : Lt01_EstDec20
Objetivo                : Equação do segundo grau com validação de raizes reais                      
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec20
{
    public static void main (String args[])
    {
    double a,b,c,r1=0,r2;
    a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a."));
    b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor b."));
    c = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor c."));
    if (a == 0)
        JOptionPane.showMessageDialog (null, "A equação não é do 2º grau.");
        else if ((Math.pow(b, 2) - 4 * a * c) < 0)
        {
            JOptionPane.showMessageDialog (null, "A equação não possue raizes reais.");
        }
            else if (((Math.pow(b, 2) - 4 * a * c) == 0))
              {
                r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                JOptionPane.showMessageDialog (null, "Para essa equação existe apenas uma raiz real: " + r1);
              }
            else
                r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                JOptionPane.showMessageDialog (null, "As raizes reais para essa equação são: " + r1 + " e " + r2 + ".");
    }
}