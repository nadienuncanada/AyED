package tp04.ejercicio1;

import tp02.ejercicio2.*;

public class PruebaAG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArbolGeneral<Integer> raiz=new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> nodo1 =new ArbolGeneral(2);
		ArbolGeneral<Integer> nodo2 =new ArbolGeneral(3);
		ArbolGeneral<Integer> nodo3 =new ArbolGeneral(4);
		raiz.agregarHijo(nodo1);
		raiz.agregarHijo(nodo2);
		raiz.agregarHijo(nodo3);
		ArbolGeneral<Integer> nodo4 =new ArbolGeneral(5);
		ArbolGeneral<Integer> nodo5 =new ArbolGeneral(6);
		nodo1.agregarHijo(nodo4);
		nodo1.agregarHijo(nodo5);
		ArbolGeneral<Integer> nodo6 =new ArbolGeneral(7);
		ArbolGeneral<Integer> nodo7 =new ArbolGeneral(8);
		ArbolGeneral<Integer> nodo8 =new ArbolGeneral(9);
		nodo2.agregarHijo(nodo6);
		nodo2.agregarHijo(nodo7);
		nodo2.agregarHijo(nodo8);
		ArbolGeneral<Integer> nodo9 =new ArbolGeneral(10);
		nodo3.agregarHijo(nodo9);
		RecorridosAG recorrido =new RecorridosAG();
		ListaGenerica<Integer> l= recorrido.numerosImparesMayoresQuePreOrden(raiz, 1);
			l.comenzar();
		ListaGenerica<Integer> l2= recorrido.numerosImparesMayoresQuePostOrden(raiz, 1);
			l2.comenzar();
		ListaGenerica<Integer> l3= recorrido.numerosImparesMayoresQueInOrden(raiz, 1);
			l3.comenzar();
		ListaGenerica<Integer> l4= recorrido.numerosImparesMayoresQuePorNiveles(raiz, 1);
			l4.comenzar();
		System.out.println("PreOrden");

		while(!l.fin()) {
			System.out.println(l.proximo());
		}
		System.out.println("PostOrden");

		while(!l2.fin()) {
			System.out.println(l2.proximo());
		}
		System.out.println("InOrden");

		while(!l3.fin()) {
			System.out.println(l3.proximo());
		}
		
		System.out.println("PorNiveles");

		while(!l4.fin()) {
			System.out.println(l4.proximo());
		}
		System.out.println("Altura de : "+raiz.altura());
		System.out.println("La altura en la que se encuentra el dato es: "+raiz.nivel(4));
		System.out.println("La anchura del arbol es: "+raiz.ancho());


	}
}
