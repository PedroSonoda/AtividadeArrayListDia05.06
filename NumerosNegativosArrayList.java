package vetor01;

import java.util.ArrayList;
import java.util.Random;

public class NumerosNegativosArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int negativo = 0;

		ArrayList<Integer> numeros = new ArrayList<Integer>();


		Random random =  new Random();

		for(int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt(); 
			numeros.add(numeroAleatorio);
		}
		
		for(Integer num:numeros ) {
			if (num < 0) {
				negativo++;
				System.out.println(num);
			}

		}
		System.out.println( " A soma dos números negativos é " + negativo);
	}

}
