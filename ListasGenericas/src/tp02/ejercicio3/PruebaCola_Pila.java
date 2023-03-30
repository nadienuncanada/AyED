package tp02.ejercicio3;

public class PruebaCola_Pila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaGenerica<String> cola=new ColaGenerica<String>();
		cola.encolar("A");
		cola.encolar("B");
		System.out.println(cola.tamanio());
		System.out.println(cola.tope());
		cola.desencolar();
		System.out.println(cola.tope());
		System.out.println(cola.esVacia());
		PilaGenerica<String> pila=new PilaGenerica<String>();
		pila.apilar("C");
		pila.apilar("D");
		System.out.println(pila.tope());
		pila.desapilar();
		System.out.println(pila.tope());
		pila.desapilar();
		System.out.println(pila.esVacia());

	}

}
