package dueloJoKenPo;

import java.util.concurrent.Semaphore;

public class Start {

	public static void main(String[] args){
		Time timeA = new Time("Time A");
		Time timeB = new Time("Time B");
		Juiz juiz = new Juiz ();
		Semaphore semaforo = new Semaphore(1);
		
		for(int i = 0; i < 5; i++) {
			new Thread(new Duelo(timeA, timeB, i, juiz, semaforo)).start();
		}
	}

}
