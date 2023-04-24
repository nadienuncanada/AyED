package tp04.ejercicio5;

import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura() {
		ArbolGeneral<T> a=this;
		return Niveles(a);
	}
	private Integer Niveles( ArbolGeneral<T> a) {
		Integer alt=0;
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		cola.encolar(a);
		cola.encolar(null);
		while(!cola.esVacia()) {
			ArbolGeneral<T> aux= cola.desencolar();
		if(aux!=null) {
			if(aux.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijo=aux.getHijos();
				hijo.comenzar();
				while(!hijo.fin()) {
					cola.encolar(hijo.proximo());
				}			}
		}
		else if(!cola.esVacia()) {
			cola.encolar(null);
			alt++;
		}
		}
		return alt;
	}
	/*private Integer CaminoLargo(Integer al,ArbolGeneral<T> a) {
		if(a.esHoja()) {
			return 0;
		}
		ListaGenerica<ArbolGeneral<T>> hijo=a.getHijos();
			hijo.comenzar();
			Integer alc=0;
			while(!hijo.fin()) {
				al=CaminoLargo(al,hijo.proximo());
				if(al>alc) {
					alc=al;
				}
			}
			return alc;
		}
*/
	public Integer nivel(T dato) {
		ArbolGeneral<T> a=this;
		return Niveles2(a, dato);
	}
	private Integer Niveles2( ArbolGeneral<T> a,T dato) {
		Integer alt=0;
		boolean encontre=false;
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		cola.encolar(a);
		cola.encolar(null);
		while(!cola.esVacia()& !encontre) {
			ArbolGeneral<T> aux= cola.desencolar();
			if((aux!=null)&&(aux.getDato()== dato))
				encontre=true;
		if(aux!=null) {
			if(aux.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijo=aux.getHijos();
				hijo.comenzar();
				while(!hijo.fin()) {
					cola.encolar(hijo.proximo());
				}			
			}
		}
		else if(!cola.esVacia()){
			cola.encolar(null);
			alt++;
		}
		}
		return alt;
	}

	public Integer ancho() {
		Integer max=-999;
		Integer act=0;
		ColaGenerica<ArbolGeneral<T>> cola=new ColaGenerica<ArbolGeneral<T>>();
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia()) {
			ArbolGeneral<T> aux= cola.desencolar();
			if(aux!=null){
				act++;
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijo=aux.getHijos();
					hijo.comenzar();
					while(!hijo.fin())
						cola.encolar(hijo.proximo());
				}
			}
			else if(!cola.esVacia()) {
				if(act>max) {
					max=act;
				}
				cola.encolar(null);
				act=0;
			}
		}
		return max;
	}

}