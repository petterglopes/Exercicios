/*
Objetivo: calcular e mostrar a série (1/1) + (1/2) + (1/3) + ....+ (1/N). 
Programador: Gabriel Rocha
Data: 19/09/2019
*/

package o8_Recursiveidade;

import java.util.Scanner;

public class Recursiva_03 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int Num = input.nextInt();
        System.out.println("\n1/" + Num + " + 1/" + (Num - 1) + " + 1/" + (Num - 2) + " + ... + 1 = " + Serie(Num));
    }
    
    static double Serie(int N) {
        double Soma;
        if(N == 1) {
            return 1;
        }else {
            Soma = (double)1/N + Serie(N - 1);
            return Soma;
        }
    }
}
