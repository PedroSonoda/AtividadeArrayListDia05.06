package vetor01;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] disciplinas = {"Matemática", "Filosofia", "História", "Física"};
		ArrayList<String>novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("Geografia");
		novaLista.add("Lingua inglesa");

		for (String i: novaLista)
		{
			System.out.println("disciplina: " +i);
		}
	}

}
