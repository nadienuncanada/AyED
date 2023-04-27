package tp04.ejercicio5;

import tp02.ejercicio2.*;

public class RedDeAguaPotable {
	public ArbolGeneral<Integer> arbol;
	public double minimoCaudal(double caudal) {
		double min=999;
		return recorrido(arbol,caudal,min);
	}
	private double recorrido(ArbolGeneral<Integer> arbol,double caudal,double min) {
		if(arbol.esHoja()) {
			if(min>=caudal)
				min=caudal;
			return min;
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijo=null;
			hijo=arbol.getHijos();
			hijo.comenzar();
			while(!hijo.fin()) {
				min=recorrido(hijo.proximo(),caudal/hijo.tamanio(),min);
		}
		
		
		}
		return min;
	}
	
}
