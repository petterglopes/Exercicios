/*
Nome do Programa        : Lt01_EstSeq01
Objetivo                : Coletar o valor do lado de um quadrado, calcular sua área e apresenra o resultado.
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq01
{
        public static void main (String args[])
        {
            int Lado,Area;
            Lado = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DO LADO"));
            Area = (Lado * Lado);
            JOptionPane.showMessageDialog(null, "A AREA DO QUADRADO " + Area);
        }
}