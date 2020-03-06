import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo2 {

	public static void main(String[] args) {
		Queue <String> waitingQueue = new LinkedList<>();
		
		waitingQueue.add("Ana");
		waitingQueue.add("Maria");
		waitingQueue.add("Ester");
		waitingQueue.add("Debora");
		
		System.out.println("A fila esta vazia? " + waitingQueue.isEmpty());
		
		System.out.println("Tamanho da Fila " + waitingQueue.size());
		
		String name = "Ester";
		if(waitingQueue.contains(name)) {
			System.out.println("Fila comtem " + name);
		}else {
			System.out.println("Fila não comtem: " + name);
		}
		
		String firstPersonInTheWaintingQueue = waitingQueue.element();
		System.out.println("Primeira Pessoa da Fila (element()): " + firstPersonInTheWaintingQueue);
		
		firstPersonInTheWaintingQueue = waitingQueue.peek();
		System.out.println("Primeira pessoa da fila: " + firstPersonInTheWaintingQueue);
	}

}
