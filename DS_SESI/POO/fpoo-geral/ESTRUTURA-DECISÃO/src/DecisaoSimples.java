
public class DecisaoSimples {

	public void testMenor(int valor1, int valor2) {
	

	if (valor1 < valor2) {
		System.out.println("VALOR 1: " +  valor1  + " � MENOR QUE O VALOR 2:  " +  valor2);
		
		}
	}
	
	public void testMenorIgual(int valor1, int valor2) {
		if (valor1 <= valor2) {
		System.out.println("VALOR 1: " +  valor1  + " � MENOR OU IGUAL QUE O VALOR 2:  " +  valor2);
		
		}
	}
		
	public void testMaior(int valor1, int valor2) {
		if (valor1 > valor2) {
		System.out.println("VALOR 1: " +  valor1  + " � MAIOR QUE O VALOR 2:  " +  valor2);
			
			}
	   }
			
	public void testMaiorIgual(int valor1, int valor2) {
		if (valor1 >= valor2) {
		System.out.println("VALOR 1: " +  valor1  + " � MAIOR OU IGUAL QUE O VALOR 2:  " +  valor2);
		
		}
	}
		
	public void testIgual(int valor1, int valor2) {
		if (valor1 == valor2) {
		System.out.println("VALOR 1: " +  valor1  + " � IGUAL AO VALOR 2:  " +  valor2);
		
			}
		}	
			
	public void testDiferente(int valor1, int valor2) {
		if (valor1 != valor2) {
		System.out.println("VALOR 1: " +  valor1  + " � DIFERENTE DO VALOR 2:  " +  valor2);
		}
	}


}

