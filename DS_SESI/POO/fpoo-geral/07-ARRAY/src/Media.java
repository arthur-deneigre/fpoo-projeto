import java.util.Scanner;
public class Media {
	String[] Alunos = {"Ana"};
	float[] notas = new float [4];
	Scanner objScanner = new Scanner(System.in);
	
	public void ListarAlunos() {
		
		/*System.out.println("1� Aluno: " + Alunos[0]);
		System.out.println("2� Aluno: " + Alunos [1]);
		System.out.println("3� Aluno: " + Alunos[2]);
		System.out.println("4� Aluno: " + Alunos[3]);*/
		
		for(int indice = 0; indice < Alunos.length; indice++ ) {
		
			//System.out.println((indice + 1) + "� ALUNO(A): " + Alunos[indice]);
			
			System.out.println("NOTAS DO ALUNO(A): " + Alunos[indice]);
		
			int cont = 0;
			while(cont < 4) {
			
			
			System.out.println("DIGITE A: " + (cont + 1) + "� NOTA ");
			notas[cont] = objScanner.nextFloat();
			cont++;
		
		
		}
		
	
		
	}
		System.out.println("LISTAGEM DE NOTAS: ");
		int cont = 0;
		while (cont < notas.length) {
			
			System.out.println((cont + 1) + "NOMES: " + notas[cont]);
			cont++;
			
		}
		
		System.out.println("Todos os Nomes: " + Alunos.length);
		
		}
		
			
	}



