import java.util.LinkedList;
import java.util.Queue;

public class ListaFuncionario {

	public static void main(String[] args) {
		Queue<Funcionario> fila_funcionario = new LinkedList<>();
		
		//Funcionario [] f = new Funcionario [4];
		
		Funcionario f1 = new Funcionario("Petter");
		Funcionario f2 = new Funcionario("Ricardo");
		Funcionario f3 = new Funcionario("Vitor");
		Funcionario f4 = new Funcionario("Guilherme");
		
		
		fila_funcionario.add(f1);
		fila_funcionario.add(f2);
		fila_funcionario.add(f3);
		fila_funcionario.add(f4);
		
		System.out.println("Fila: ");
		
		for(Funcionario f : fila_funcionario) {
			System.out.println(f.getNome());
		}
	}

}
