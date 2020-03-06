//Exercício P1 Algoritmo, 1º semestre 2019

/*Esse código consiste em identifcar o valor de um saque em um caixa eletrônico,
e veirificar qual a menor quantidade de cédulas possível para esse saque.
A maior cédula é a de R$50,00 e a menor é R$2,00.
O valor mínimo para o saque é de R$5,00*/

import java.util.Scanner;

public class Prova1 {
    static int saq; // Valor do saque.
    static int c50; // Quantidade de cédulas de 50 reais.
    static int c20; // Quantidade de cédulas de 20 reais.
    static int c10; // Quantidade de cédulas de 10 reais.
    static int c5; // Quantidade de cédulas de 5 reais.
    static int c2; // Quantidade de cédulas de 2 reais.
    static int n1; // Variavel para contarnar possivel erro na quantidade de cédulas quando o valor do saque for terminado em 1 ou 3.

    public static void main(String[] args) {
				
	Scanner input = new Scanner(System.in);
		
	//Lê o valor do saque.
	System.out.print("informe o valor do saque: ");
	saq = input.nextInt();
	input.close();
		
	//Verifica se o valor do saque é menor que 5 reais.
	if (saq < 5)
	    System.out.print("O valor mínimo de para saque é R$5,00");
	    
            //Verifica se o valor do saque termina em 1 ou 3. Chama o método de contagem.
        else if (saq % 10 < 5 && saq % 2 == 1) {
            n1 = (1 + saq % 10);
            saq = saq - n1;
            contagem();
	}
        //Chama o método de contagem.
	else
            contagem();
		
            //Exibe a quantidade de cada cédula quando maior que 1.
            if (c50 >= 1)
		System.out.println(c50 + " cédula(s) de R$50,00.");
            if (c20 >= 1)
		System.out.println(c20 + " cédula(s) de R$20,00.");
            if (c10 >= 1)
		System.out.println(c10 + " cédula(s) de R$10,00.");
            if (c5 >= 1)
		System.out.println(c5 + " cédula(s) de R$5,00.");
            if (c2 >= 1)
		System.out.println(c2 + " cédula(s) de R$2,00.");
	}

    public static void contagem() {
		
	//Verifica se será possível emitir e a quantiadde de cédula de 50 reais.
	if (saq >= 50) {
            c50 = (saq - saq % 50) / 50;
            saq = saq % 50;
	}
        else
            c50 = 0;
		
	//Verifica se será possível emitir e a quantiadde de cédula de 20 reais.
	if (saq >= 20) {
            c20 = (saq - saq % 20) / 20;
            saq = saq % 20;
        }
        else
            c20 = 0;
	//Verifica se será possível emitir e a quantiadde de cédula de 10 reais.
	if (saq >= 10) {
	    c10 = (saq - saq % 10) / 10;
	    saq = saq % 10;
	}
	else
	    c10 = 0;
	    
	//Verifica se será possível emitir e a quantiadde de cédula de 5 reais.
	if (saq >= 5 && saq % 2 != 0) {
	    c5 = (saq - saq % 5) / 5;
	    saq = (saq % 5) + n1;
	}
	else
	   c5 = 0;
	    
	//Verifica se será possível emitir e a quantiadde de cédula de 2 reais.
	if (saq >= 2)
            c2 = saq / 2;
	else
	    c2 = 0;
    }
}