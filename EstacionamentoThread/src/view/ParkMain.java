package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCar;

public class ParkMain {

	public static void main(String[] args) {
		int permissoes = 3;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int idCar = 0; idCar < 10; idCar++) {
			Thread car = new ThreadCar(idCar, semaforo);
			car.start();
		}

	}

}
