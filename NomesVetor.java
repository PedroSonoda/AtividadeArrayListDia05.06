package vetor01;

import java.util.Scanner;

public class NomesVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[] = new  String[5];

		Scanner ler = new Scanner (System.in);
		for (int i =0; i<5; i++) {
			System.out.println("Informe um nome" + i+ "..:");
			a[i]=ler.nextLine();

		}

		for (int i= 0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		ler.close();
		
	}
	
}



