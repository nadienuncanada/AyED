package tp04.ejercicio5;
import tp04.ejercicio1.*;
import tp02.ejercicio2.*;
public class Recorrido {
	public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa>arbol) {
		int sum=0;
		int max=-1;
		int nvl=0;
		int ancho =0;
		int veces=0;
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola=new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		ArbolGeneral<AreaEmpresa> aux;
		cola.encolar(arbol);
		cola.encolar(null);
		while(!cola.esVacia()) {
			aux=cola.desencolar();
			if(aux!=null) {
				sum+=aux.getDato().getTardanza();
				ancho++;
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> hijo=aux.getHijos();
					hijo.comenzar();
					while(!hijo.fin()) 
						cola.encolar(hijo.proximo());
				}
			}
			else  {
				veces++;
				System.out.println("Veces que entro: "+veces);
				if((sum/ancho)>max) {
					max=sum/ancho;
				}
				System.out.println("El promedio del nivel: "+nvl+" es: "+sum/ancho);
				nvl++;
				if(!cola.esVacia())
					cola.encolar(null);
				sum=0;
				ancho=0;
			}
			
		}
		
		
		return max;
	}

}
