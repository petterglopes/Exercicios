package controller;

public class Cassino extends Thread{
	private static int posicao;
	private int pontos;
	private int idJogador;


	public Cassino(int idJogador) {
		this.idJogador = idJogador;
		pontos = 0;
		posicao = 0;
	}

	@Override
	public void run() {
		jogarDados();
		colocacao();
	
	}

	private void jogarDados() {
		try {
			do {
				int somaDados = (((int) (Math.random()*6)+1) + ((int) (Math.random()*6)+1));
				//System.out.println("soma dos dados do jogador #" + idJogador + " é " + somaDados);
				if (somaDados == 7 || somaDados == 11) {
					pontos ++;
					System.out.println("O jogador #" + idJogador + " acumulou " + pontos);
				}
			}while (pontos < 5);
			sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		posicao++;
	}


	private void colocacao() {
		switch (posicao) {
			case 1: System.out.println(posicao + "ª posição: #" + idJogador + " prêmio de R$5000,00");
				break;
			case 2: System.out.println(posicao + "ª posição: #" + idJogador + " prêmio de R$4000,00");
				break;
			case 3: System.out.println(posicao + "ª posição: #" + idJogador + " prêmio de R$3000,00");
				break;
			default: System.out.println(posicao + "ª posição: #" + idJogador + " sem premiação.");
		}
	}


}
