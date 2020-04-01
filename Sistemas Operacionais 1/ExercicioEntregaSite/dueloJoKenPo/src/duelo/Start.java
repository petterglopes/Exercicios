package duelo;

public class Start{
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			new Thread(new Partida("Jogador " + i)).start();
		}
	}
}
