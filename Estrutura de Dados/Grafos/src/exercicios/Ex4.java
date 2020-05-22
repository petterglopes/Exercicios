package exercicios;

public class Ex4 {

	public static void main(String[] args) {
		
		int matriz [][] = {{0,0,0,0,0,0},{1,0,0,0,0,0},{0,1,0,0,0,0},{0,1,1,0,0,0},{1,1,0,1,0,0},{0,0,1,1,1,0}};
		
		matriz = completaMatriz(matriz);
		
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(matriz[i][j]);		
			}
			System.out.println();
		}
	}
	
	public static int [][] completaMatriz(int[][] matriz ){
		
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(i != j) {
					if(matriz[i][j] > 0) {
						matriz[j][i] = matriz[i][j];
					}
				}
			}
		}				
		return matriz;
	}
}
