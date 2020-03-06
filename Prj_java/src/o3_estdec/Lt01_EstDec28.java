/*
Nome do Programa        : Lt01_EstDec28
Objetivo                : Calculo novo preço                    
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec28
{
    public static void main( String args[])
    {
        double vm, pa, pn;
        vm = Double.parseDouble(JOptionPane.showInputDialog("Informe a venda mensal:"));
        pa = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual"));
        
        if (vm < 500 && pa < 30)
        {
            pn = (pa * 1.1);
            JOptionPane.showMessageDialog(null, "O novo preço é R$" + pn + ".");
        }
        else if((vm >= 500) && (vm < 1000) && (pa >= 30) && (pa < 80))
        {
            pn = (pa * 1.15);
            JOptionPane.showMessageDialog(null, "O novo preço é R$" + pn + ".");
        }
            else if (vm >= 1000 && pa >= 80)
            {
                pn = (pa * 0.95);
                JOptionPane.showMessageDialog(null, "O novo preço é R$" + pn + ".");
            }
                else
                {
                    JOptionPane.showMessageDialog(null, "O novo preço é R$" + pa + ".");
                }
    }
}