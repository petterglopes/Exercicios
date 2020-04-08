package dueloJoKenPo2;

public class Start {

	public static void main(String[] args) {
		Time timeA = new Time("Time A");
		Time timeB = new Time("Time B");
		Juiz juiz = new Juiz ();
		
		for(int i = 0; i < 5; i++) {
			new Thread(new Duelo(timeA, timeB, i, juiz)).start();
		}
		
		
	}

}
