package br.com.alura.banheiro;

public class Banheiro {
	
	public void fazNumero1() {
		
		System.out.println(Thread.currentThread().getName() + " bate na porta");
		
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " entra no banheiro");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " fazendo coisa rapida");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " dando descarga");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " lavando as maos");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " saindo do banheiro");			
		}		
	}
	
	public void fazNumero2() {
		
		System.out.println(Thread.currentThread().getName() + " bate na porta");
		
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " entra no banheiro");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " fazendo coisa demorada");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " dando descarga");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " lavando as maos");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " saindo do banheiro");
		}		
	}
}
