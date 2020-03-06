/*
Objetivo: calcular e mostrar a série 1+2+3+...+100
Programador: Gabriel Rocha
Data: 19/09/2019
*/

package o8_Recursiveidade;

public class Recursiva_01 {
    
    public static void main(String[] args) {
        System.out.println("Soma da sequência 1 + 2 + 3 + 4 + ... + 100 = " + Serie(100));
    }
    
    static int Serie(int N) {
        int Soma;
        if(N == 1) {
            return 1;
        }
        Soma = N + Serie(N - 1);
        return Soma;
    }
}
