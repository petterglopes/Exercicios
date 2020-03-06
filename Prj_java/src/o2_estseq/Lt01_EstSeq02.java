/*
Nome do Programa        : Lt01_EstSeq02
Objetivo                : Coletar o valor do salário, apresetar o novo saláriio com reajuste de 15%.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq02
{
    public static void main (String args[])
        {
            double sal,salreaj;
            sal = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DO SALARIO"));
            salreaj = (sal * 1.15);
            JOptionPane.showMessageDialog(null, "O VALOR DO SALARIO COM REAJUSTE " + salreaj);
        }
}