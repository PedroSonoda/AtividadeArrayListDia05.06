package vetor01;

public class UsandoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		
		for(String name : names) {
			System.out.println(name + ", ");
		}
		
	}

}
