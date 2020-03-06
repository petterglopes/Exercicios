/*
Nome do Programa        : Lt01_EstDec29
Objetivo                : Selecionar o tipo de investimento e calcular o valor corrigido                    
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec29
{
    public static void main( String args[])
    {
        int ti;
        double vi;
        ti = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de investimento. 1 - para poupança. 2 - para renda fixa."));
        switch (ti)
        {
            case 1:
                vi = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do investimento."));
                vi = (vi * 1.03);
                JOptionPane.showMessageDialog(null, "O valor corrigido após 30 dias do investimento é: R$" + vi + ".");
                break;
            case 2:
                vi = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do investimento."));
                vi = (vi * 1.05);
                JOptionPane.showMessageDialog(null, "O valor corrigido após 30 dias do investimento é: R$" + vi + ".");
                break;
            default:
                JOptionPane.showMessageDialog(null, "O tipo de investimeto escolhido não é válido.");
        }
    }
}
