package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;
import tp03.ejercicio1.ColaGenerica;
public class RedBinariaLlena {
	private ArbolBinario<Integer> arbol;
public RedBinariaLlena(ArbolBinario<Integer> a) {
		this.arbol=a;
}
public void retardoReenvio(){
		int max=-1;//mantiene el maximo valor de retardo
		int hoja=0;//contador de hojas
		int maxH=0;//mantiene el valor de hoja con maximo retardo
		ArbolBinario<Integer> aDesencolador;//donde voy a desencolar datos
		ColaGenerica<ArbolBinario<Integer>> cola=new ColaGenerica<ArbolBinario<Integer>>();
		cola.encolar(arbol);//encolo la raiz
		cola.encolar(null);// y null que se utiliza para saber si me fui de nivel
		while(!cola.esVacia()) {//mientras la cola no sea vacia
			aDesencolador=cola.desencolar();//desencolo la raiz
			if(aDesencolador!=null) {//mientas no sea null
				if(aDesencolador.tieneHijoIzquierdo()) {//tiene hijo izq?
					aDesencolador.getHijoIzquierdo().setDato(aDesencolador.getDato()+aDesencolador.getHijoIzquierdo().getDato());//le sumo al nodo siguiente el valor del nodo actual para ir teniendo en los nodos la sumatoria de todos los nodos posteriores
					cola.encolar(aDesencolador.getHijoIzquierdo());//en colo el siguiente dato con el valor de retardo ya actualizado
				}
				if(aDesencolador.tieneHijoDerecho()) {
					aDesencolador.getHijoDerecho().setDato(aDesencolador.getDato()+aDesencolador.getHijoDerecho().getDato());
					cola.encolar(aDesencolador.getHijoDerecho());
				}
			if(aDesencolador.esHoja()) {//si es una hoja, 
				hoja++; //hoja++
				if(max<aDesencolador.getDato()) {//y si el dato que entro es mas grande guardo su valor y que hoja es.
					max=aDesencolador.getDato();
					maxH=hoja;
				}
					
			}
			 else if (!cola.esVacia()) {//si la cola no es vacia meto de nuevo null.
				 cola.encolar(null);
			 }
			}
		}
		System.out.println("La hoja con maximo retardo es: "+maxH+" y su valor es: "+ max);//printeo la hoja y el valor de retardo maximo
	}
}
