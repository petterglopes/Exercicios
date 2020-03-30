package controller;

public class Pista {
	
	public synchronized void procedimentosPista() {
		System.out.println(Thread.currentThread().getName() + " manobrando");
		try {
			Thread.sleep(3000 + (int) (Math.random() * 4001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " taxiando");
		
		try {
			Thread.sleep(5000 + (int) (Math.random() * 5001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " decolando");
		try {
			Thread.sleep(1000 + (int) (Math.random() * 30001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " afastando");
		try {
			Thread.sleep(3000 + (int) (Math.random() * 5001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}	
}
