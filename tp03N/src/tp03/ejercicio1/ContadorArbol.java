package tp03.ejercicio1;
public class ContadorArbol {
	private ArbolBinario<Integer> arbol;
	
	public ContadorArbol(ArbolBinario<Integer> a) {
		arbol=a;
	}
	public ListaEnlazadaGenerica<Integer> numerosParesInOrden() {
		ListaEnlazadaGenerica<Integer> lista=new ListaEnlazadaGenerica<Integer>();//creo lista
		numerosParesInOrden2(this.arbol,lista);//envio el arbol y la lista
		return lista;
	}
		private void numerosParesInOrden2(ArbolBinario<Integer> a,ListaEnlazadaGenerica<Integer> l){//esto logra agregar a la lista todos los datos que sean pares del arbol.
		if(a.esVacio()==false) {
			
			}
			if(a.tieneHijoIzquierdo()) {//si tiene hijo izq 
				numerosParesInOrden2(a.getHijoIzquierdo(),l);//llamo al mismo proceso con el hijo izquierdo y la lista
			}
			if(a.getDato()%2==0) {//si el dato que tiene es par 
				l.agregarFinal(a.getDato());//se agregar
			}
			if(a.tieneHijoDerecho()) {//hijo derecho?
				numerosParesInOrden2(a.getHijoDerecho(),l);//llamo con hijo derecho
			}
		
		}
		public ListaEnlazadaGenerica<Integer> numerosParesPostOrden() {//lo mismo que la anterior pero en postorden, lo unico que cambia es cuando se agregan los datos.
			ListaEnlazadaGenerica<Integer> lista2=new ListaEnlazadaGenerica<Integer>();
			numerosParesPostOrden2(this.arbol,lista2);
			return lista2;
		}
			private void numerosParesPostOrden2(ArbolBinario<Integer> a,ListaEnlazadaGenerica<Integer> l){
			if(a.esVacio()==false) {
				
				if(a.tieneHijoIzquierdo()) {
					numerosParesPostOrden2(a.getHijoIzquierdo(),l);
				}
				
				if(a.tieneHijoDerecho()) {
					numerosParesPostOrden2(a.getHijoDerecho(),l);
				}
				if(a.getDato()%2==0) {
					l.agregarFinal(a.getDato());
				}
			}
		}
}

