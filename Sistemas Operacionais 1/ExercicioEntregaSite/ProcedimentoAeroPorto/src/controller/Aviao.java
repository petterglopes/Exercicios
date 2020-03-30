package controller;

public class Aviao implements Runnable{

	private Pista pista;

	public Aviao(Pista pista) {
		this.pista = pista;
	}

	@Override
	public void run() {
		pista.procedimentosPista();		
	}

}
