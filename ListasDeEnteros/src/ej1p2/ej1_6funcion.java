package ej1p2;
import tp02.ejercicio1.*;
import java.util.Scanner;
public class ej1_6funcion {
	static Scanner entrada= new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Ingrese numero:");
			int n=entrada.nextInt();
			ListaDeEnterosEnlazada lista=new ListaDeEnterosEnlazada();
			lista=calcularSucesion(n,lista);
			System.out.println("Tamanio: "+lista.tamanio());
			lista.comenzar();
			while(!lista.fin()) {
				System.out.println(lista.proximo());
			}
	}
	public static ListaDeEnterosEnlazada calcularSucesion (int n,ListaDeEnterosEnlazada lista)  {
		if(n==1) {
			//lista.agregarFinal(n);//esto esta de mas jeje 
			return lista;
		}
		else if(n%2==0) {
			lista.agregarFinal(n/2);
			calcularSucesion(n/2,lista);
		}
		else{
			lista.agregarFinal((3*n)+1);
			calcularSucesion((3*n)+1,lista);
		}
		
		return lista;
	}
}
