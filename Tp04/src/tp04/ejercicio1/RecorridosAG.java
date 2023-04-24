package tp04.ejercicio1;
import tp02.ejercicio2.*;
public class RecorridosAG {
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral <Integer> a, Integer n){
		ListaGenerica<Integer> lista= new ListaEnlazadaGenerica<Integer>();
			RecorridoPreOrden(a,lista,n);
		return lista;
	}
	private void RecorridoPreOrden(ArbolGeneral<Integer> a,ListaGenerica<Integer> lista,Integer n){
		//caso base
		if((a.getDato()%2!=0) & (a.getDato()>n)) {
			lista.agregarFinal(a.getDato());
		}
		ListaGenerica<ArbolGeneral<Integer>> hijo= a.getHijos();
			hijo.comenzar();
		//caso recursivo
			while(!hijo.fin()) {
				RecorridoPreOrden(hijo.proximo(),lista,n);
			}
			
	}
	public ListaGenerica< Integer > numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista=new ListaEnlazadaGenerica<Integer>();
			RecorridoInOrden(a,lista,n);
		return lista;
	}
	private void RecorridoInOrden(ArbolGeneral<Integer> a,ListaGenerica<Integer> lista,Integer n) {
		ListaGenerica<ArbolGeneral<Integer>> hijo= a.getHijos();	
			hijo.comenzar();
		if(!hijo.fin()) {
			RecorridoInOrden(hijo.proximo(),lista,n);
		}
		if((a.getDato()%2!=0)&(a.getDato()>n)) {
				lista.agregarFinal(a.getDato());//es agregar al final a medida querecorres pones el dato uno atras de otro.
		}
			while(!hijo.fin()) {
				RecorridoInOrden(hijo.proximo(),lista,n);
			}
		}
	public ListaGenerica< Integer > numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista= new ListaEnlazadaGenerica<Integer>();
		RecorridoPreOrden(a,lista,n);
	return lista;
}
	private void RecorridoPostOrden(ArbolGeneral<Integer> a,ListaGenerica<Integer> lista,Integer n){
	ListaGenerica<ArbolGeneral<Integer>> hijo= a.getHijos();
		hijo.comenzar();
		while(!hijo.fin()) {
			RecorridoPostOrden(hijo.proximo(),lista,n);
		}
		if((a.getDato()%2!=0) & (a.getDato()>n)) {
			lista.agregarFinal(a.getDato());
		}
	}
	public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista =new ListaEnlazadaGenerica<Integer>();
			RecorridoPorNiveles(a,lista,n);
		return lista;
	}
	private void RecorridoPorNiveles(ArbolGeneral<Integer> a,ListaGenerica<Integer> lista, Integer n) {
		ColaGenerica<ArbolGeneral<Integer>> cola=new ColaGenerica<ArbolGeneral<Integer>>();
			ArbolGeneral<Integer> aux;
		cola.encolar(a);
		while(!cola.esVacia()) {
			aux=cola.desencolar();
			if((aux.getDato()%2!=0) & (aux.getDato()>n)) {
				lista.agregarFinal(aux.getDato());
			}
			if(aux.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijo=aux.getHijos();
				hijo.comenzar();
				while(!hijo.fin()) {
					cola.encolar(hijo.proximo());
				}
			}
		}
	}
}

