package tp03.ejercicio1;
public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 
	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int c=0;
		int ret =contador(c);
	return ret;
	}
	private int contador(int c) {
		if(this.tieneHijoIzquierdo())
			c=hijoIzquierdo.contador(c);
		if(this.tieneHijoDerecho())
			c=hijoDerecho.contador(c);	
		if(this.esHoja())
			c++;
		return c;
	}
	
    public ArbolBinario<T> espejo() {
    	ArbolBinario<T> a=new ArbolBinario<T>(this.getDato());
			if(this.tieneHijoIzquierdo()) 
				a.agregarHijoDerecho(hijoIzquierdo.espejo());
			if(this.tieneHijoDerecho()) 
				a.agregarHijoIzquierdo(hijoDerecho.espejo());
		
		return a;
	}

  
	
	public int contarNiveles() {
	    if (this.esVacio()) {
	        return 0;
	    } 
	    else {
	        int alturaIzquierdo = 0;
	        int alturaDerecho = 0;
	        if (this.tieneHijoIzquierdo()) {
	            alturaIzquierdo = this.getHijoIzquierdo().contarNiveles();
	            System.out.println("altura izquierda: "+alturaIzquierdo);

	        }
	        if (this.tieneHijoDerecho()) {
	            alturaDerecho = this.getHijoDerecho().contarNiveles();
	            System.out.println("altura derecha: "+alturaDerecho);
	        }
	        return Math.max(alturaIzquierdo, alturaDerecho) + 1;
	    }
	}
	/*public void entreNiveles(int n, int m) {//CREADO POR CHATGPT, FUNCIONA PERO SE PUEDE HACER MAS FACIL Y COMO LO DA LA CATEDRA
		ColaGenerica<ArbolBinario<T>> cola=new ColaGenerica<ArbolBinario<T>>();//creo la cola
		cola.encolar(this);//encola la raiz
		int nivelAct=0;//contador de niveles
		while(!cola.esVacia()) {
			int nodosAct=cola.tamanio();
//			System.out.println(cola.tamanio());
			for(int i=0;i<nodosAct;i++) {
				ArbolBinario<T> aux= cola.desencolar();
				 if(aux.tieneHijoIzquierdo()) 
					 cola.encolar(aux.getHijoIzquierdo());
				 if(aux.tieneHijoDerecho()) 
					 cola.encolar(aux.getHijoDerecho());
				 if (nivelAct >= n & nivelAct <= m) 
					System.out.print(aux.getDato()); 
			}
			
			if(nivelAct==m)
				break;
			nivelAct++;
		}
	}
		*/
	public void entreNiveles(int n,int m) {//
		int nivelAct=0;
	    ArbolBinario<T> arbol;
	    ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
	     cola.encolar(this);
	     cola.encolar (null);
	    while (!cola. esVacia()) {
	         arbol = cola.desencolar();
	         if (arbol != null) {
	        	 if(nivelAct>=n & nivelAct<=m) 
	        		 System.out.print(arbol.getDato());
	        	 if (arbol.tieneHijoIzquierdo())
	                 cola.encolar(arbol.getHijoIzquierdo());
	             if (arbol.tieneHijoDerecho())
	                 cola.encolar(arbol.getHijoDerecho()); 
	         } 
	         else if (!cola.esVacia()) {
	        	 nivelAct++;
	        	 System.out.println();
	             cola.encolar(null);
	         	}
	    }
	}
}
