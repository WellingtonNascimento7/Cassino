package controller;

import java.util.Random;

public class Dados {
	
	public int Dado() {
		int d;
		Random random = new Random();
		d = 1 + random.nextInt(6);
		return d;
	}
	
	public String Classificacao(int cont[]) {
		int p;
		String s=null;
		p = cont.length;
		for(int i=0; i<=p; i++) {
			if(cont[i] == 5) {
				s=Final();
			}else {
				s = null;
			}
		}
		return s;
	}
	
	public String Final() {
		String s=null;
		
		return s;
		
	}
}
