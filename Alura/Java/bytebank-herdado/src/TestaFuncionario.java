
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario petter = new Funcionario();
		petter.setNome("Petter");
		petter.setCpf("111111111-11");
		petter.setSalario(2000);
		
		System.out.println(petter.getNome());
		System.out.println(petter.getSalario());
		System.out.println(petter.getBonificacao());

	}

}
