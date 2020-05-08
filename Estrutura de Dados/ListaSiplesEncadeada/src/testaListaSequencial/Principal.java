package testaListaSequencial;

import listasequencial.ListaSequencial;

public class Principal {

	public static void main(String[] args) {
		ListaSequencial listaDePessoas = new ListaSequencial();
		
		Pessoa[] pessoa = new Pessoa[10];
		
		pessoa [0] = new Pessoa ("Ana");
		pessoa [1] = new Pessoa ("Antonio");
		pessoa [2] = new Pessoa ("Rodrigo");
		pessoa [3] = new Pessoa ("Gabriel");
		pessoa [4] = new Pessoa ("Mateus");
		pessoa [5] = new Pessoa ("Vitor");
		pessoa [6] = new Pessoa ("Pedro");
		pessoa [7] = new Pessoa ("Petter");
		pessoa [8] = new Pessoa ("Ricardo");
		pessoa [9] = new Pessoa ("Ronaldo");
		
		System.out.println(listaDePessoas.tamanhoLista());
		
		for(int i = 0; i < 8; i++) {
			listaDePessoas.adiciona(pessoa[i]);
		}
		
		for(int i = 0; i < listaDePessoas.tamanhoLista(); i++) {
			System.out.println(pessoa[i]);
		}
		
		listaDePessoas.adiciona(3, pessoa[8]);
		
		for(int i = 0; i < listaDePessoas.tamanhoLista(); i++) {
			System.out.println(pessoa[i]);
		}
		
		System.out.println(listaDePessoas.contem(pessoa[1]));
	}
}
