/*
Nome do Programa        : Lt01_EstDec21
Objetivo                : Média aritmética                      
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec21
{
    public static void main (String args[])
    {
    double a;
    double b;
    double c;
    double d;
    double m;
    a = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do 1º bimestre."));
    b = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do 2º bimestre."));
    c = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do 3º bimestre."));
    d = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do 4º bimestre."));
    m = (a + b + c + d) / 4;
    if (m >= 6)
        JOptionPane.showMessageDialog (null, "APROVADO.");
        else if (m >= 3)
            JOptionPane.showMessageDialog (null, "EXAME.");
            else
                JOptionPane.showMessageDialog (null, "RETIDO.");
    }
}
