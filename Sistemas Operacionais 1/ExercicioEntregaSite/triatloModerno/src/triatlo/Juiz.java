package triatlo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Juiz {

	private int chegada = 1;

	private List<Atleta> listaDeChegada = new LinkedList<Atleta>();

	public void pontuacaoFinal(Atleta atleta) {
		if (chegada < 25) {
			atleta.pontuacaoTotal((250 - 10 * (chegada - 1)));
			chegada++;
			listaDeChegada.add(atleta);
		} else {
			atleta.pontuacaoTotal((250 - 10 * (chegada - 1)));
			listaDeChegada.add(atleta);
			Collections.sort(listaDeChegada);
			System.out.println(listaDeChegada);
		}
	}

}
