package o8_Recursiveidade;

import javax.swing.JOptionPane;

public class Recursividade_05 {
    public static void main (String args[]){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de N"));
        System.out.print(serie5 (n));
    }
    static double serie5 (int n){
        if (n == 1){
            return 1;
        }
        return fFat(n) + serie5(n-1);
    }
    
    static int fFat (int n){
        if (n == 1)
            return 1;
        return n * fFat(n - 1);
    }
}