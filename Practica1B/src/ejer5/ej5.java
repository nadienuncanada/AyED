package ejer5;
import java.util.Scanner;
public class ej5 {
	static Scanner entrada =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el tamanio del vector: ");
		int n=entrada.nextInt();
		int[] vec=new int[n];
		for(int i=1;i<n;i++) {
			vec[i]=i;
		}
		int []resultado= Retorno(vec);
		for(int i=0;i<resultado.length;i++) {
			System.out.print(resultado[i]);
			System.out.println(" ");
		}
		System.out.println("Con Clase");
		Numeros num= new Numeros();
		RetornoC(vec,num);
		System.out.println("El Maximo es: "+num.getMax());
		System.out.println("El Minimo es: "+num.getMin());
		System.out.println("El Promedio es: "+num.getPro());
		System.out.println("Con Clase Sin Parametros: ");
		NoRetorno(vec);
		System.out.println("El Maximo es: "+NumSinRetorno.getMax());
		System.out.println("El Minimo es: "+NumSinRetorno.getMin());
		System.out.println("El Promedio es: "+NumSinRetorno.getPro());

	}
public static int[] Retorno(int[]vec){
	int max=-1;
	int min=99999;
	int pro=0;
	for(int i=0;i<vec.length;i++) {
		pro+=vec[i];
		if(vec[i]<min) {
			min=vec[i];
		}
		if(vec[i]>max) {
			max=vec[i];
		}
	}
	return new int[] {min,max,(pro/vec.length)};
}
public static Numeros RetornoC(int []vec, Numeros num) {
	int sum=0;
	for(int i=0;i<vec.length;i++) {
		sum+=vec[i];
		if(vec[i]<num.getMin()) {
			num.setMin(vec[i]);
		}
		if(vec[i]>num.getMax()) {
			num.setMax(vec[i]);
		}
	}
	num.setPro(sum/vec.length);
	return num;
}
public static void NoRetorno(int[]vec) {
	int pro=0;
	for(int i=0;i<vec.length;i++) {
		pro+=vec[i];
		if(vec[i]<NumSinRetorno.getMin()) {
			NumSinRetorno.setMin(vec[i]);
		}
		if(vec[i]>NumSinRetorno.getMax()) {
			NumSinRetorno.setMax(vec[i]);
		}
	}
	NumSinRetorno.setPro(pro/vec.length);

}
}
