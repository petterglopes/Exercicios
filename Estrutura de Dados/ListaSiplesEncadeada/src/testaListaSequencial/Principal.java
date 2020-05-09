package testaListaSequencial;

import listasequencial.ListaSequencial;

public class Principal {

	public static void main(String[] args) {
		ListaSequencial listaDePessoas = new ListaSequencial();

		Pessoa pessoa1 = new Pessoa("Ana");
		Pessoa pessoa2 = new Pessoa("Antonio");
		Pessoa pessoa3 = new Pessoa("Rodrigo");
		Pessoa pessoa4 = new Pessoa("Gabriel");
		Pessoa pessoa5 = new Pessoa("Mateus");
		Pessoa pessoa6 = new Pessoa("Vitor");
		Pessoa pessoa7 = new Pessoa("Pedro");
		Pessoa pessoa8 = new Pessoa("Petter");
		Pessoa pessoa9 = new Pessoa("Ricardo");
		Pessoa pessoa10 = new Pessoa("Ronaldo");

		System.out.println(listaDePessoas.tamanhoLista());

		listaDePessoas.adiciona(pessoa1);
		listaDePessoas.adiciona(pessoa2);
		listaDePessoas.adiciona(pessoa3);
		listaDePessoas.adiciona(pessoa4);
		listaDePessoas.adiciona(pessoa5);
		listaDePessoas.adiciona(pessoa6);
		listaDePessoas.adiciona(pessoa7);
		listaDePessoas.adiciona(pessoa8);

		for (int i = 0; i < listaDePessoas.tamanhoLista(); i++) {
			System.out.println(listaDePessoas.getObject(i));
		}

		listaDePessoas.adiciona(3, pessoa9);

		for (int i = 0; i < listaDePessoas.tamanhoLista(); i++) {
			System.out.println(listaDePessoas.getObject(i));
		}

		System.out.println(listaDePessoas.contem(pessoa2));
	}
}
