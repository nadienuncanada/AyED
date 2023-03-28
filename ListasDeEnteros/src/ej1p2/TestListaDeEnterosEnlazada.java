package ej1p2;
import tp02.ejercicio1.*;
import java.util.Scanner;
public class TestListaDeEnterosEnlazada {
	static Scanner entrada= new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDeEnterosEnlazada lista=new ListaDeEnterosEnlazada();
		System.out.println("Ingrese Numero a Agregar al Array: ");
		Integer n=entrada.nextInt();
		
		while (n!=-1){
			lista.agregarFinal(n);
			System.out.println("Ingrese Numero a Agregar al Array: ");
				n=entrada.nextInt();
		}
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo());
		}
	}

}
