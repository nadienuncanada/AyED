package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;
import tp03.ejercicio1.ColaGenerica;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> arbol;
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		this.arbol=a;
	}
	public int sumaElementoProfundidad(int p) {
			int nivelAct=0;
			int sumatot=0;
		    ArbolBinario<Integer> arbol;
		    ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		     cola.encolar(this.arbol);
		     cola.encolar (null);
		    while (!cola. esVacia()) {
		         arbol = cola.desencolar();
		         if (arbol != null) {
		        	 if(nivelAct==p) 
		        		sumatot+=arbol.getDato();
		        	 if (arbol.tieneHijoIzquierdo())
		                 cola.encolar(arbol.getHijoIzquierdo());
		             if (arbol.tieneHijoDerecho())
		                 cola.encolar(arbol.getHijoDerecho()); 
		         } 
		         else if (!cola.esVacia()) {
		        	 nivelAct++;
//		        	 System.out.println();
		             cola.encolar(null);
		         	}
		    }
		    return sumatot;
		}
}

