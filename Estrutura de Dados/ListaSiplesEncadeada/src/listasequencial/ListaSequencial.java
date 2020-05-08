package listasequencial;

public class ListaSequencial {
	private Object[] listaDeObjetos = new Object[5];
	
	private int totalDeObjetosNaLista = 0;
	
	public void adiciona(Object objeto) {
		garantaEpaco();
		listaDeObjetos[totalDeObjetosNaLista] = objeto;
		totalDeObjetosNaLista++;
	}
	
	public void adiciona(int posicao, Object objeto) {
		garantaEpaco();
		if(!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição invalida!!!");
		}
		for(int i = totalDeObjetosNaLista-1; i >= posicao; i--) {
			listaDeObjetos[i + 1] = listaDeObjetos[i];
		}
		
		listaDeObjetos[posicao] = objeto;
		totalDeObjetosNaLista++;
	}
	
	public Object getObject(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição invalida!!!");
		}
		return listaDeObjetos[posicao];
	}
	
	public void remove(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição invalida!!!");
		}
		for(int i = posicao; i < totalDeObjetosNaLista - 1; i++) {
			listaDeObjetos[i] = listaDeObjetos[i+1];
		}
		totalDeObjetosNaLista--;
	}
	
	public boolean contem(Object objeto) {
		boolean busca = false;
		for(int i = 0; i < totalDeObjetosNaLista; i++) {
			if(objeto.equals(listaDeObjetos[i])) {
				busca = true;
			}
		}
		return busca;
	}
	
	public int tamanhoLista() {
		return totalDeObjetosNaLista;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >=0 && posicao < totalDeObjetosNaLista;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao <= totalDeObjetosNaLista;
	}

	private void garantaEpaco() {
		if(totalDeObjetosNaLista == listaDeObjetos.length) {
			Object[] novaListaDeObjetos = new Object[this.listaDeObjetos.length * 2];
			for(int i = 0; i < listaDeObjetos.length; i++) {
				novaListaDeObjetos[i] = listaDeObjetos[i];
			}
			listaDeObjetos = novaListaDeObjetos;
		}
	}
}
