
public class NMaioresNumeros {

	public static void main(String[] args) {
		
		int n = 3;
		
		int [] vet = new int [1000000];
				
		for (int i = 0; i < vet.length; i++) {
			vet [i] = (int) (Math.random()*1000001);
		}
		
		int [] vetResultado = encotrarMaiores(vet, n);
		
		for (int i = 0; i < vetResultado.length; i++) {	
			System.out.println(vetResultado[i]+"\n");
		}
		
	}
	public static int [] encotrarMaiores(int [] vet, int n) {
		int [] maiores = new int [n];
		int maior = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if (i == 0) {
				for (int j = 0; j < maiores.length; j++) {
					maiores[j] = 0;
				}
			}
			
			if (maior < vet [i]) {
				maior = vet [i];
				for(int j = maiores.length; j > 0; j--) {
					maiores [j] = maiores [j - 1];
				}
				maiores [0] = maior;
			}
		}
		return maiores;
	}
	
}
