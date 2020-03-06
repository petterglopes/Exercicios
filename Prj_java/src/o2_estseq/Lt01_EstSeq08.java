/*
Nome do Programa        : Lt01_EstSeq08
Objetivo                : Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.                       
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o2_estseq;

import javax.swing.JOptionPane;

public class Lt01_EstSeq08
{
 public static void main(String args[])
    {             
        int deposito = Integer.parseInt(JOptionPane.showInputDialog("INFORME O VALOR DO DEPOSITO"));
                
        double rendimento = deposito * 1.013;
        
        JOptionPane.showMessageDialog(null, "O DEPOSITO COM RENDIMENTO É " + rendimento);
    }
}