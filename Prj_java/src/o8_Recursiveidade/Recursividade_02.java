
package o8_Recursiveidade;

import javax.swing.JOptionPane;

public class Recursividade_02 {
    public static void main (String asrg[]) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de N"));
        System.out.print(serie2(n));
    }
    
    static int serie2(int n){
        if (n == 0){
            return 0;
        }
        return n + serie2(n - 1);
    }
}