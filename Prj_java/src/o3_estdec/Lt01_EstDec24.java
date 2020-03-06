/*
Nome do Programa        : Lt01_EstDec24
Objetivo                : Verificar se um valor inteiro é divisível por 2 e 3                      
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/

package o3_estdec;

import javax.swing.JOptionPane;

public class Lt01_EstDec24
{
    public static void main( String args[])
    {
        int a;
        int b;
        int c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor."));
        
        b = (a / 2);
        b = (b * 2);
        c = (a / 3);
        c = (c * 3);
        
        if (a == b && a == c)
            
            JOptionPane.showMessageDialog(null, "O valor é divisivel por 2 e 3.");
        
        else
            
            JOptionPane.showMessageDialog(null, "O valor não é divisivel por 2 e 3.");
    }
}