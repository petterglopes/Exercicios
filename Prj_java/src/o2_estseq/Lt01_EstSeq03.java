/*
Nome do Programa        : Lt01_EstSeq03
Objetivo                : Calcular a area do triangulo.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq03
{
    public static void main(String args[])
    {             
        int base = Integer.parseInt(JOptionPane.showInputDialog("QUAL E O VALOR DA BASE?"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("QUAL E O VALOR DA ALTURA?"));
        
        int area = (base * altura)/2;
        
        JOptionPane.showMessageDialog(null, "A AREA É " + area);
    }
}
