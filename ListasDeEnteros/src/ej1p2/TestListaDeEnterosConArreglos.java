package ej1p2;
import java.util.Scanner;
import tp02.ejercicio1.*;
public class TestListaDeEnterosConArreglos {
static Scanner entrada =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDeEnteros lista=new ListaDeEnterosConArreglos();
		System.out.println("Ingrese Numero a Agregar al Array: ");
			int n=entrada.nextInt();
			
		while (n!=-1){
			lista.agregarFinal(n);
			System.out.println("Ingrese Numero a Agregar al Array: ");
				n=entrada.nextInt();
		}
		System.out.println("Tamanio: "+lista.tamanio());
		lista.comenzar();
		ImprimirR(lista);
		System.out.println("Otro");
		lista.comenzar();
		System.out.println("Tamanio: "+lista.tamanio());
		while(!lista.fin()){
			System.out.println(lista.proximo());
		}
	}
	static void ImprimirR(ListaDeEnteros lista) {
		if(!lista.fin()) {
			int ult=lista.tamanio();
			System.out.println(lista.elemento(ult));
			lista.eliminarEn(ult);
			ImprimirR(lista);
		}
	}
}	
