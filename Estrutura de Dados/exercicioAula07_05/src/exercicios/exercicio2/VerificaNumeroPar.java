package exercicios.exercicio2;

import java.util.Scanner;

public class VerificaNumeroPar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		verNumPar(new Scanner(System.in).nextInt());
		
	}
	
	private static void verNumPar(int n) {
		if(n == 1) {
			return;
		}
		if(verPar(n) == 1) {
			System.out.println(n);
			verNumPar(n - 1);
		}else {
			verNumPar(n - 1);
		}
	}

	private static int verPar(int n) {
		if(n%2==0)
			return 1;
		return 0;
	}
}
