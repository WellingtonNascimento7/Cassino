package controller;

import java.util.Random;

public class ThreadComp extends Thread {
	private int d1, d2;
	private static int[] cont = new int[10] ;
	private int jog;

	public ThreadComp(int jog) {
		this.jog = jog;

	}

	@Override
	public void run() {
		calc();
	}

	private int[] calc() {
		try {
			sleep(jog * 100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Random random = new Random();
		d1 = 1 + random.nextInt(6);
		d2 = 1 + random.nextInt(6);
		
		if(d1 + d2 == 7 || d1 + d2 == 11) {
			cont[jog-1] += 1;
		}
		
		System.out.println("jogagor: " + jog +" d1: " + d1 + " d2: " + d2 + " cont: " + cont[jog-1]);
		return cont;
		
	}
	
	public void Classif() {
		try {
			sleep(1 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<=9; i++){
		System.out.println("jogador " + (i+1) + " Pontos: " + cont[i]);
		}
	}

}

