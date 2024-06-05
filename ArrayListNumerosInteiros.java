package vetor01;

import java.util.ArrayList;

public class ArrayListNumerosInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int soma = 0;
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		for(Integer num:numeros ) {
			soma += num;
			System.out.println(num);
		}
		
		System.out.println(soma);
	}

}
