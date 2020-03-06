/*
Objetivo: receber um número. Calcular e mostrar seu fatorial.
Data: 19/09/2019
Programador: Gabriel Rocha
 */

package o8_Recursiveidade;

import java.util.Scanner;

public class Recursiva_00 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int Num = input.nextInt();
        System.out.println("\n" + Num + "! = " + Fatorial(Num));
    }
    
    static int Fatorial(int N) {
        int Fat;
        if(N == 1) {
            return 1;
        }else {
            Fat = N * Fatorial(N - 1);
            return Fat;
        }
    }
}
