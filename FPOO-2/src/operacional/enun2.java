package operacional;

public class enun2 {

	private int N1;
	private int N2;
	private int N3;
	
	public void verificarMaior() {
		
		if(getN1() > getN2()) {
			if(getN1() > getN3()) {
				System.out.println("N1 � O MAIOR NUMERO");
			}
		}
		
		if(getN2() > getN3()) {
			if(getN2() > getN3()) {
				System.out.println("N2 � MAIOR");
		
	}
		}
	
	
		if(getN3() > getN1()) {
			if(getN3() > getN2()) {
				System.out.println("N3 � O MAIOR NUMERO");
	
	
	}
	
		}
	}
		public int getN1() {
		return N1;
	}
	public void setN1(int n1) {
		N1 = n1;
	}
	public int getN2() {
		return N2;
	}
	public void setN2(int n2) {
		N2 = n2;
	}
	public int getN3() {
		return N3;
	}
	public void setN3(int n3) {
		N3 = n3;
	}
	
	
}
	


