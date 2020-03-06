package Recursividade;

import java.util.Random;
import java.util.Scanner;

public class Pesquisa_Binária {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Vetor = new int[20];
        Vetor = Carrega_Vetor(Vetor);
        System.out.println("Vetor NÃO ordenado: \n");
        Mostra_Vetor(Vetor);
        System.out.println("\n\nVetor JÁ ordenado: \n");
        Vetor = Ordena_Vetor(Vetor);
        Mostra_Vetor(Vetor);
        System.out.print("\n\nDigite o número que deseja procurar no vetor: ");
        int Num = input.nextInt();
        int Achou = Pesquisa(Num, Vetor, 0, 19);
        if(Achou == Num) {
            System.out.println("\nO número foi encontrado no vetor!");
        }else {
            System.out.println("\nO número NÃO foi encontrado no vetor!");
        }
    }
    
    static int[] Carrega_Vetor(int[] Vt) {
        Random R = new Random();
        for(int I = 0; I <= 19; I++) {
            Vt[I] = R.nextInt(101);
        }
        return Vt;
    }
    
    static int[] Ordena_Vetor(int[] Vt) {
        for(int I = 0; I <= 18; I++) {
            for(int J = I + 1; J <= 19; J++) {
                if(Vt[I] > Vt[J]) {
                    int Aux = Vt[I];
                    Vt[I] = Vt[J];
                    Vt[J] = Aux;
                }
            }
        }
        return Vt;
    }
    
    static void Mostra_Vetor(int[] Vt) {
        for(int I = 0; I <= 19; I++) {
            System.out.print("|" + Vt[I]);
        }
    }
    
    static int Pesquisa(int N, int[] Vt, int Min, int Max) {
        int I = (Min + Max) / 2;
        if(Min > Max) {
            return -1;
        }else if(Vt[I] == N) {
            return N;
        }else if(Vt[I] > N) {
            return Pesquisa(N, Vt, Min, I - 1);
        }else {
            return Pesquisa(N, Vt, I + 1, Max);
        }
    }
}