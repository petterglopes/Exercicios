package o1_aula;


import javax.swing.JOptionPane;


public class Exrecursivo00 {
    public static void main (String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro:"));
        JOptionPane.showMessageDialog(null, Ffat(num));
    }
    public static int Ffat(int n){
        int fat;
        if (n == 1){
            return 1;
        }
        else{
           fat = n * Ffat(n-1);
           return fat;
        }
    }
}
