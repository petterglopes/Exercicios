/*
Nome do Programa        : Lt01_vet01
Objetivo                : 1.	Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a.	A média dos valores entre 10 e 200;
b.	A soma dos números ímpares.
                      
Nome do Programador     : Petter Gimenes Lopes
Data de desenvolvimento : 15/08/2019
*/
package o6_vetor;

import javax.swing.JOptionPane;
import java.util.Random;

public class Lt01_vet01
{

    public static void main(String[] args) {
		
        Random numAleatorio = new Random();

        int[] vet = new int[50];
        int counter1 = 0;
        int somaImpar = 0;
	int media = 0;
		
	for (int counter = 0; counter < vet.length; counter++) {
            vet[counter] = numAleatorio.nextInt(1001);
            if (vet[counter] >= 10 && vet[counter] <= 200) {
		media = media + vet[counter];
		counter1 = counter1 + 1;
            }
            if (vet[counter] % 2 == 1)
		somaImpar = somaImpar + vet[counter];
        }
        String resultado = "Index     Value    Index    Value";
        for (int counter = 0; counter < 24; counter++) {
            resultado = resultado + "\n       "+ counter + "        " + vet[counter]+"      "+ counter +25+ "        " + vet[counter + 25];
        }
            JOptionPane.showMessageDialog(null, resultado + "\nA média dos valores entre 10 e 200 é " + (media/counter1) + " e a soma dos valres impares é " + somaImpar);
    }
}
