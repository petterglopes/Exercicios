/*
Objetivo: calcular e mostrar a série (N/1) +(N-1 / 2) + (N-2 / 3) + .... + (1/N) 
Programador: Gabriel Rocha
Data: 19/09/2019
*/

package o8_Recursiveidade;

import java.util.Scanner;

public class Recursiva_04 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        double N = input.nextDouble();
        System.out.println("\n" + N + "/1 + " + (N - 1) + "/2 + " + (N - 2) + "/3 + ... + 1/" + N + " = " + Serie(N, 1));
    }
    
    static double Serie(double Num, double Den) {
        double Soma;
        if(Num == 1) {
            return (1/Den);
        }else {
            Soma = Num/Den + Serie(Num - 1, Den + 1);
            return Soma;
        }
    }
}
