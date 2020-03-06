/*
Nome do Programa        : Lt01_EstSeq07
Objetivo                : Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq07 
{
 public static void main(String args[])
    {             
        int comp = Integer.parseInt(JOptionPane.showInputDialog("INFORME O COMPRIMENTO"));
        int larg = Integer.parseInt(JOptionPane.showInputDialog("INFORME A LARGURA"));
        int alt = Integer.parseInt(JOptionPane.showInputDialog("INFORME A ALTURA"));
                
        int vol = (comp * larg * alt);
        
        JOptionPane.showMessageDialog(null, "O VOLUME É " + vol);
    }
}
