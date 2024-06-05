package vetor01;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrosArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		
		
		ArrayList<String> carros = new ArrayList<String>();

		
		carros.add("Honda");
		carros.add("Hyundai");
		carros.add("Chevrolet");
		carros.add("Ford");
		carros.add("Nissan");
		carros.add("Jeep");
		carros.add("Citroen");
		carros.add("Volvo");
		carros.add("Caoa chery");
		carros.add("subaru");


		System.out.println("Os carros disponiveis são:" + carros);
		System.out.println("Qual automotivo deseja ver?");
		
		int num = ler.nextInt();
		System.out.println(carros.get(num));
	
	}

}
