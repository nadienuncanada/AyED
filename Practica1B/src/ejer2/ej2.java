package ejer2;
import java.util.Scanner;
public class ej2 {
	static Scanner entrada =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese Numero para el array: ");
		int n;
		n = entrada.nextInt();
		arrayTamanioN(n);
		
	}
	public static void arrayTamanioN(int n) {
		int[]vec =new int[n];
		for(int i=1;i<n;i++) {
			vec[i]=n*i;
		}
		for(int i=1;i<n;i++) {
			System.out.print(vec[i]);
		}
	}

}
