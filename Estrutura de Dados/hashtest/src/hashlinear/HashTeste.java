package hashlinear;

import java.util.HashMap;

public class HashTeste {
	public static void main(String[] args) {

		HashMap<String, Integer> tabela = new HashMap<String, Integer>();
		tabela.put("a", 10);
		tabela.put("b", 20);
		tabela.put("c", 30);

		System.out.println(tabela);

		System.out.println(tabela.containsValue(30));
		System.out.println(tabela.containsKey("b"));
		System.out.println(tabela.replace("b", 40));
		System.out.println(tabela);
	}
}