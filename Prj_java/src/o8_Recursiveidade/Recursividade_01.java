package o8_Recursiveidade;

public class Recursividade_01 {
    public static void main (String ars[]){
        System.out.print(serie1(100));
    }
    static int serie1(int n){
        if (n == 0){
            return 0;
        }else{
            return n + serie1(n - 1);
        }
    }
}