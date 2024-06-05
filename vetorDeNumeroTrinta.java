package vetor01;

import java.util.Scanner;

public class vetorDeNumeroTrinta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);


		int a[] = new  int[5];
		int soma = 0;

		for (int i =0; i<5; i++) {
			System.out.println(" Informe um valor:");
			a[i]=ler.nextInt();

			soma += a[i];
		}

		if(soma <30) {
			System.out.println("O valor é menor que 30, resultando em: " +soma);

		}

		else {
			System.out.println("O valor é maior que 30, resultando em: " +soma);
		}
		ler.close();
	}

}
