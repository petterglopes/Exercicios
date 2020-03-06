
package o8_Recursiveidade;

import javax.swing.JOptionPane;

public class Recursividade_04 {
    public static void main (String args[]){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de N"));
        System.out.print(serie4 (n, 1));
    }
    static double serie4 (double n, double aux){
        if (n == 0){
            return 0;
        }
        return serie4(n-1, aux + 1) + n/aux;
    }
}
