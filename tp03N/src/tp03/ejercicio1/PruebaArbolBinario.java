package tp03.ejercicio1;
import tp03.ejercicio4.*;
public class PruebaArbolBinario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario<Integer> arbol = new ArbolBinario<>(1);
        arbol.agregarHijoIzquierdo(new ArbolBinario<>(2));
        arbol.agregarHijoDerecho(new ArbolBinario<>(3));
        arbol.getHijoIzquierdo().agregarHijoIzquierdo(new ArbolBinario<>(4));
        arbol.getHijoIzquierdo().agregarHijoDerecho(new ArbolBinario<>(5));
        arbol.getHijoDerecho().agregarHijoIzquierdo(new ArbolBinario<>(6));
        arbol.getHijoDerecho().agregarHijoDerecho(new ArbolBinario<>(7));
//        arbol.getHijoDerecho().getHijoDerecho().agregarHijoDerecho(new ArbolBinario<>(8));//HASTA ACA SE CREA EL ARBOL.
		recorrerArbol(arbol);
		System.out.println("Hojas: "+arbol.contarHojas());
		
		ArbolBinario<Integer> nuevo=arbol.espejo();//UTILIZO EL ESPEJAR ARBOL
		recorrerArbol(nuevo);//RECORRO EL ARBOL ESPEJADO
		ArbolBinario<Integer> espeja2=nuevo.espejo();
		recorrerArbol(espeja2);
		
		System.out.println("CANTIDAD DE NIVELES: "+arbol.contarNiveles());
		
		arbol.entreNiveles(1,2);//IMPRIME LOS DATOS ENTRE ESOS NIVELES
		
		System.out.println();
		System.out.println("CONTADOR");
		ListaEnlazadaGenerica<Integer> print2 = new ListaEnlazadaGenerica<Integer>();
		ContadorArbol cnt= new ContadorArbol(arbol);
		print2=cnt.numerosParesPostOrden();
		print2.comenzar();
		while(!print2.fin()) {
			System.out.println(print2.proximo());
		}
		System.out.println("Inorden:");
		ListaEnlazadaGenerica<Integer> print = new ListaEnlazadaGenerica<Integer>();
		print=cnt.numerosParesInOrden();
		print.comenzar();
		while(!print.fin()) {
			System.out.println(print.proximo());
		}
		
		
//		RedBinariaLlena rbl= new RedBinariaLlena(arbol);//esto modifica el arbol, se podria crear una copia y pasarle la copia.
//			rbl.retardoReenvio();
		
		ProfundidadDeArbolBinario pdab=new ProfundidadDeArbolBinario(arbol);
		System.out.println("La suma de todos los elementos del nivel deseado es: " +pdab.sumaElementoProfundidad(2));
		}
	public static void recorrerArbol(ArbolBinario<Integer> arbol) {
	if(arbol.esVacio()==false) {
		System.out.println(arbol.getDato());
		if(arbol.tieneHijoIzquierdo()) {
			recorrerArbol(arbol.getHijoIzquierdo());
		}
		if(arbol.tieneHijoDerecho()) {
			recorrerArbol(arbol.getHijoDerecho());

		}
	}
	}
}

