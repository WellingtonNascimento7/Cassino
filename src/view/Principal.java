package view;

import controller.ThreadJog;

public class Principal {
	public static void main(String[] args) {		

		System.out.println("------------CASSINO-----------\n\nClassificação: ");
		//Cria os 10 jogadores/Threads
		for (int i = 1; i <= 10; i++) {
			Thread jogador = new ThreadJog(i);
		}


	}
}
