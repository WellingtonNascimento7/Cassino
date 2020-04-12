package view;

import controller.ThreadComp;
public class Principal {
	public static void main(String[] args) {
		int a = 10;
		int b = 2, cont[] = new int [10];
		// int op = 2;
		


		// ThreadCalc t = new ThreadCalc(a,b,op); // igual ao de baixo
		for (int op = 0; op < 10; op++) {
			Thread t1 = new ThreadComp(1);
			Thread t2 = new ThreadComp(2);
			Thread t3 = new ThreadComp(3);
			Thread t4 = new ThreadComp(4);
			Thread t5 = new ThreadComp(5);
			Thread t6 = new ThreadComp(6);
			Thread t7 = new ThreadComp(7);
			Thread t8 = new ThreadComp(8);
			Thread t9 = new ThreadComp(9);
			Thread t10 = new ThreadComp(10);
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t7.start();
			t8.start();
			t9.start();
			t10.start();
			
		}
		ThreadComp t10 = new ThreadComp(10);
		t10.Classif();

	}
}
