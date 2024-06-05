package vetor01;

import java.util.ArrayList;
import java.util.Scanner;

public class AcaiArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		ArrayList<String> acai= new ArrayList<String>();


		acai.add("banana");
		acai.add("leite em pó");
		acai.add("leite condensado");
		acai.add("morango");
		acai.add("granola");
		
		System.out.println("Os ingredientes disponiveis são:" + acai);
		System.out.println("deseja retirar algum ingrediente [1] Gostaria de adicionar um ingrediente? [2] Gostaria de manter?[3]");
		
		int num = ler.nextInt();
		
		if (num == 1) {
			System.out.println("Qual ingrediente você deseja retirar? (escolham o número entre 0 e 4 ");

			acai.remove(ler.nextInt());
			System.out.println(acai);
			
		}
		
		else if (num ==2) {
			System.out.println("Você gostaria de fazer um adicional?");
			acai.add(ler.nextInt(), null);
			System.out.println(acai);
			
		}
		else System.out.println(acai);
}

}