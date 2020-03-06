/*
Nome do Programa        : Lt01_EstSeq12
Objetivo                : Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq12
{
 public static void main(String args[])
    {             
        int an = Integer.parseInt(JOptionPane.showInputDialog("INFORME O ANO DE NASCIMENTO"));
        int aa = Integer.parseInt(JOptionPane.showInputDialog("INFORME O ANO ATUAL"));
                
        int id = aa - an;
        int id17 = id + 17;
        
        JOptionPane.showMessageDialog(null, "A IDADE É " + id + " E DAQUI A 17 ANOS SERÁ " + id17);
    }
}