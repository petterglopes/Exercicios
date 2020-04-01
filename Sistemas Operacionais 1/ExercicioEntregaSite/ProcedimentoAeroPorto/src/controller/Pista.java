package controller;

public class Pista {
	
	private String nomePista;

	public void setNome(String nome) {
		this.nomePista = nome;
	}



	public synchronized void procedimentosPista(String nomeAviao) {
		System.out.println(nomeAviao + " manobrando  - " + nomePista);
		try {
			Thread.sleep(3000 + (int) (Math.random() * 4001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nomeAviao + " taxiando - " + nomePista);
		
		try {
			Thread.sleep(5000 + (int) (Math.random() * 5001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nomeAviao + " decolando - " + nomePista);
		try {
			Thread.sleep(1000 + (int) (Math.random() * 30001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nomeAviao + " afastando - " + nomePista);
		try {
			Thread.sleep(3000 + (int) (Math.random() * 5001));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}	
}
