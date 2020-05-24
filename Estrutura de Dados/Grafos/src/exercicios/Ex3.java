package exercicios;

public class Ex3 {

	public static void main(String[] args) {
		int tamanhoMatriz = (int) (2 + Math.random() * 9);
		int[][] m = new int[tamanhoMatriz][tamanhoMatriz];

		for (int i = 0; i < tamanhoMatriz; i++) {
			for (int j = 0; j <= i; j++) {
				m[i][j] = (int) (Math.random() * 11);
			}
		}

		m = espelhaMatriz(m, tamanhoMatriz);

		for (int i = 0; i < tamanhoMatriz; i++) {
			for (int j = 0; j < tamanhoMatriz; j++) {
				System.out.print(" " + m[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < tamanhoMatriz; i++) {
			for (int j = 0; j < tamanhoMatriz; j++) {
				if(m[i][j] > 0)
				System.out.println("(" + (i + 1) + ", " + (j + 1) + ")" + "peso " + m[i][j]);
			}
		}
	}

	public static int[][] espelhaMatriz(int[][] matriz, int tamanhoMatriz) {

		for (int i = 1; i < tamanhoMatriz; i++) {
			for (int j = 0; j < i; j++) {
				matriz[j][i] = matriz[i][j];
			}
		}
		return matriz;
	}
}
