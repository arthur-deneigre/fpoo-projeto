
public class Textos {

	public void testesLogicos() {
		
			String nome1 = "GIOVANNA";
			String nome2 = "";
			String nome3 = "giovanna";

			System.out.println(" � VAZIO? " + nome1.isEmpty());
			System.out.println(" � VAZIO? " + nome2.isEmpty());
		
			System.out.println(" � IGUAL? " + nome1.equals(nome2));
			System.out.println(" � IGUAL? " + nome1.equals(nome3));
			System.out.println(" � IGUAL? " + nome1.equalsIgnoreCase(nome3));

			System.out.println(" TAMANHO: " + nome1.length());
			System.out.println(" TAMANHO: " + nome2.length());
			System.out.println(" TAMANHO: " + nome3.length());
		
	}
}
