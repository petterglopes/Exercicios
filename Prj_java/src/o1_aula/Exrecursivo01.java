package o1_aula;

import javax.swing.JOptionPane;


public class Exrecursivo01 {
    static String serie = "Serie1 = ";
    public static void main (String args[]){
        int n = 100;
        JOptionPane.showMessageDialog(null, FSerie1(n));
    }
    public static String FSerie1(int n){
        if (n < 1){
            return serie;
        }
        else if (n == 100){
            serie = FSerie1(n - 1) + n;
            return serie;
        }
        else{
            serie = FSerie1(n - 1) + n + "+" ;
            return serie;
        }
    }
}

