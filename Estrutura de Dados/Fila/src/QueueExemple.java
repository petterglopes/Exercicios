import java.util.LinkedList;
import java.util.Queue;

public class QueueExemple {
	public static void main(String[] args) {
		Queue <String> waitingQueue = new LinkedList<>();
		
		waitingQueue.add("Matheus");
		waitingQueue.add("Marcos");
		waitingQueue.add("Lucas");
		waitingQueue.add("Joao");
		waitingQueue.add("Paulo");
		
		System.out.println("fila: " + waitingQueue);
		
		String name = waitingQueue.remove();
		System.out.println("Remove da Fila: " + name + " | Nova Fila: " + waitingQueue);
		
		name = waitingQueue.poll();
		System.out.println("Remove da Fila: " + name + " | Nova Fila: " + waitingQueue);
	}
}
