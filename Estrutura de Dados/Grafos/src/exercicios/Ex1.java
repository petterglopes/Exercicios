package exercicios;

public class Ex1 {

	public static void main(String[] args) {
		
		int matriz [][] = {{0,0,0,0,0,0},{1,0,0,0,0,0},{0,1,0,0,0,0},{0,1,1,0,0,0},{1,1,0,1,0,0},{0,0,1,1,1,0}};
		
		System.out.println(encontraVertice (matriz));
		
		System.out.println(tipoDaMatriz(matriz));
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Grau do vertice " + (i + 1)+ " = " + grauDoVertice(matriz)[i]);
		}
		
		System.out.println("\nlista de adjacências\n");
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + listaDeadjacencias(matriz)[i]);
		}
		
	}
	
	public static String encontraVertice(int [][] matriz) {
		String vertices = "";
		
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(matriz[i][j] > 0) {
					vertices += "vertice L" + (i + 1) + " C" + (j + 1) + "\n";
				}
			}
		}		
		return vertices;
	}
	public static String tipoDaMatriz(int [][] matriz) {
		
		for (int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				if(matriz[i][j] != matriz[j][i]) {
					return "digrafo\n";
				}
			}
		}		
		return "grafo nao-direcinal\n";
	}
	
	public static int [] grauDoVertice(int [][] matriz) {
		int [] gv = new int [6];
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(matriz[i][j] > 0) {
					gv [i] += 1;
				}
			}
		}			
		return gv;
	}
	
	public static String [] listaDeadjacencias(int [][] matriz) {
		String [] la = {"","","","","",""};
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(matriz[i][j] > 0) {
					la [i] += " ==> " + (j + 1);
				}
			}
		}			
		return la;
	}
}