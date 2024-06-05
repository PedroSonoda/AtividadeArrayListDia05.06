package vetor01;

import java.util.Scanner;

public class VetorABeC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);


		int a[] = new  int[5];
		int b[] = new int[5];
		int c[] = new int[5];

		int soma = 0;

		for (int i =0; i<5; i++) {
			System.out.println(" Informe um valor para o vetor A:");
			a[i]=ler.nextInt();
		}

		for (int   i=0; i<5; i++) {
			System.out.println(" Informe um valor para o vetor B:");
			b[i]=ler.nextInt();
		}
		for (int i=0; i<5; i++ ) {
		c[i]=b[i]+a[i];
		}

		System.out.println(" Os vetores C são :" + soma);
		
		}

		
	}


