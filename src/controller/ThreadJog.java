package controller;

import java.util.Random;

public class ThreadJog extends Thread {
	private int d1, d2;
	//private static int[] resultado = new int[10] ;
	private static int contv;
	private int id;//numero do jogador
	Random random = new Random();

	public ThreadJog(int id) {
		this.id = id;
		start();//rodar sem presisar dar o start na classe principal

	}

	@Override
	public void run() {
		Classificar();
	}
	
	//Metodo para lançar os dados e validar se o jogador marcou o ponto
	private boolean Dados() {
				
		d1 = 1 + random.nextInt(6);
		d2 = 1 + random.nextInt(6);
		
		if(d1 + d2 == 7 || d1 + d2 == 11) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//Metodo que faz a classificação dos jogadores
	public void Classificar() {
		int pontog = 0;//variavel que armazena os pontos ganhos pelo jogador
		
		//loop que roda ate o jogador completar 5 pontos
		while(pontog != 5) {	
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(Dados()) {
				pontog++;
			}
		} 
		contv++; // conta o numero de jogadores que atingiram 5 pontos
			switch(contv) {
			case 1:
				System.out.println("Jogador: " + id + " ficou em 1º lugar e ganhou R$5000");
				break;
			case 2:
				System.out.println("Jogador: " + id + " ficou em 2º lugar e ganhou R$4000");
				break;
			case 3:
				System.out.println("Jogador: " + id + " ficou em 3º lugar e ganhou R$3000");
				break;
			default:
				//System.exit(0); //comando que para o programa (para não exibir os perdedores) 
				System.out.println("Jogador: " + id + " Não ganhou" );				
				break;
			}
			
	}
	
	
}

