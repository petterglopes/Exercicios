package conjunto;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Mauricio");
		set.add("Paulo");
		set.add("Jonas");
		
		
		System.out.println(set);
		
		set.remove("Mauricio");
		
		System.out.println(set);
		
	}

}
