package ejer1;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recorrido(5,10);
		//WRecorrido(6,11);
		Recursivo(5,10);
	}
	public static void Recorrido(int x,int y) {
		 for(int i=x;i<=y;i++) {
			 System.out.print(i);
		 }
	 }
	public static void WRecorrido(int x,int y) {
		int i=x;
		while(i<=y) {
			System.out.print(i);
			i++;
			
		}
	}
	public static void Recursivo(int x, int y) {
		if(x<=y) {
			System.out.print(x);
			Recursivo(x+1,y);
		}
	}
	
}

	 