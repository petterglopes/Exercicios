package controller;

import java.util.concurrent.Semaphore;

public class ThreadCar extends Thread{
	private int idCar;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;
	
	public ThreadCar (int idCar, Semaphore semaforo) {
		this.idCar = idCar;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run(){
		carroAndando();
		try {
			semaforo.acquire();
			CarroEstacionado();
		}catch (InterruptedException e ){
			e.printStackTrace();
		}finally {
			semaforo.release();
			CarroSaindo();
		}
	}
	private void carroAndando() {
		int distanciaTotal =(int)((Math.random() * 2001) + 1000);
		int distanciaPercorrida = 0;
		int deslocamento = 100;
		int tempo = 100;
		while (distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Carro #" + idCar + " ja percorreu" + distanciaPercorrida + "m.");
		}
		posChegada++;
		System.out.println("Carro #" + idCar + " foi o" + posChegada  + "o. a chegada");
		
	}
	
	private void CarroEstacionado() {
		System.out.println("carro #" + idCar + "estacionou");
		int tempo = (int)((Math.random() * 2001) + 2000);
		
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private void CarroSaindo() {
		posSaida++;
		System.out.println("carro #" + idCar + "foi o" + posSaida + "o. a sair");
		
	}

}
