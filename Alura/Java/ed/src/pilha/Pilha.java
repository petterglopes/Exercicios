package pilha;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		
		stack.push("Mauricio");
		stack.push("Marcelo");
		stack.pop();
		stack.push("Guilherme");
		stack.push("Paulo");
		stack.pop();
		stack.push("João");
		
		System.out.println(stack);
	}

}
