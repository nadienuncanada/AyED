package tp02.ejercicio3;

public class PruebaCola_Pila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaGenerica<String> cola=new ColaGenerica<String>();
		cola.encolar("Pig");
		cola.encolar("Pepa");
		System.out.println(cola.tamanio());
		System.out.println(cola.tope());
		cola.desencolar();
		System.out.println(cola.tope());
		cola.desencolar();
		System.out.println(cola.tope());
		cola.desencolar();
		System.out.println(cola.tope());
		cola.desencolar();
		System.out.println(cola.tope());
		System.out.println(cola.esVacia());
		System.out.println(cola.tamanio());
	}

}
