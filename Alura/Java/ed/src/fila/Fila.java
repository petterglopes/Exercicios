package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		queue.add("Mauricio");
		queue.add("Paulo");
		queue.add("Guilherme");
		queue.poll();
		queue.add("João");
		queue.poll();
		System.out.println(queue);
	}
}
