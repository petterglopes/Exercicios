package controller;

import java.util.concurrent.Semaphore;

public class Aviao implements Runnable{

	private String nomeAviao;
	private Semaphore semaforo;
	private String pista;
	

	
	public Aviao(String nomeAviao, Semaphore semaforo, String pista) {
		this.nomeAviao = nomeAviao;
		this.semaforo = semaforo;
		this.pista = pista;
	}


	public void procedimentosPista() {
		System.out.println(nomeAviao + " manobrando  - " + pista);
		try {
			Thread.sleep(3000 + (int) (Math.random() * 4001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nomeAviao + " taxiando - " + pista);
		
		try {
			Thread.sleep(5000 + (int) (Math.random() * 5001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nomeAviao + " decolando - " + pista);
		try {
			Thread.sleep(1000 + (int) (Math.random() * 30001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nomeAviao + " afastando - " + pista);
		try {
			Thread.sleep(3000 + (int) (Math.random() * 5001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}



	@Override
	public void run() {
		try {
			semaforo.acquire();
			procedimentosPista();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
	}	

}
