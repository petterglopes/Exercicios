package controller;

public class Aviao implements Runnable{

	static Pista pistaNorte = new Pista();
	static Pista pistaSul = new Pista();
	private String nomeAviao;
	

	
	public Aviao(String nomeAviao) {
		this.nomeAviao = nomeAviao;
	}



	@Override
	public void run() {
		if((int) (Math.random() * 2) == 1) {
			pistaNorte.setNome("Pista Norte");
			pistaNorte.procedimentosPista(nomeAviao);
		}else {
			pistaSul.setNome("Pista Sul");
			pistaSul.procedimentosPista(nomeAviao);
		}
	}

}
