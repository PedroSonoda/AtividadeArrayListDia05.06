package vetor01;

import java.util.ArrayList;

public class ListaFrutasArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> frutas = new ArrayList<String>();

		frutas.add("Uva verde");
		frutas.add("Laranja Bahia");
		frutas.add("Tangerina");
		frutas.add("Maça Verde");
		frutas.add("Cereja");
		frutas.add("Pitaya");
		frutas.add("Manga");
		frutas.add("Framboesa");
		frutas.add("Mirtilo");
		frutas.add("Morango");



		for (String fruta : frutas){
			System.out.println("Frutas : " + fruta);
		}
		System.out.println();

		frutas.remove(8);
		frutas.remove(7);
		frutas.remove(5);
		frutas.remove(2);
		frutas.remove(0);



		for (String fruta : frutas){
			System.out.println("Frutas : " + fruta);
		}
	}

}
