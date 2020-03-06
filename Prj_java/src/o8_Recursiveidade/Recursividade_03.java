package o8_Recursiveidade;

import javax.swing.JOptionPane;

public class Recursividade_03 {
    public static void main (String args[]){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de N"));
        System.out.print(serie3 (n));
    }
    static double serie3 (double n ){
        if (n == 0){
            return 0;
        }
        return serie3(n-1) + 1/n;
    }
}