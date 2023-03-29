package tp02.ejercicio3;
import tp02.ejercicio2.*;
public class ColaGenerica<T> extends NodoGenerico<T>{
	private NodoGenerico<T> inicio;
	private NodoGenerico<T> actual;
	private NodoGenerico<T> fin;
	private int tamanio;
	
	public int tamanio() {
		return this.tamanio;
	}
	public boolean esVacia() {
		return this.tamanio()==0;
	}
	public void comenzar() {
		actual = inicio;
	}
	public boolean encolar(T elem) {
		NodoGenerico<T> aux = new NodoGenerico<T>();//genero nodo
		aux.setDato(elem);//le asigno elemento

		if (this.inicio == null) {//si esta vacia
			this.inicio = aux;//se vuelven el nuevo nodo
			this.actual = aux;
			this.fin = aux;
		} else {
			aux.setSiguiente(this.inicio);//sino el primero se vuelve el siguiente
			this.inicio = aux;//y el nuevo dato se vuelve el primero
		}
		this.tamanio++;//aumento el tamanio
		return true;
	}
	public T desencolar() {
		if(this.inicio!=null) {
			T aux=this.inicio.getDato();
			if(this.inicio.getSiguiente()==null){
				this.inicio=null;
			}
			else {
				this.inicio=this.inicio.getSiguiente();
			}
			this.tamanio--;
			return aux;
		}
	return null;
	}
	public T tope() {
		if(this.inicio!=null) {
			T aux=this.inicio.getDato();
			return aux;
		}
		return null;
	}
	
}
