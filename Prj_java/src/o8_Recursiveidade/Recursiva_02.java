/*
Objetivo: calcular e mostrar a série (N) + (N-1) + (N-2) + ... + (1). 
Programador: Gabriel Rocha
Data: 19/09/2019
*/

package o8_Recursiveidade;

import java.util.Scanner;

public class Recursiva_02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int Num = input.nextInt();
        System.out.println("\n" + Num + " + " + (Num - 1) + " + " + (Num - 2) + " + ... + 1 = " + Serie(Num));
    }
    
    static int Serie(int N) {
        int Soma;
        if(N == 1) {
            return 1;
        }else {
            Soma = N + Serie(N - 1);
            return Soma;
        }
    }
}
