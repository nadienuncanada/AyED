package ej2p2;
import tp02.ejercicio2.*;
public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaEnlazadaGenerica<Estudiante> lista=new ListaEnlazadaGenerica<Estudiante>();
		for(int i=0;i<4;i++) {
			Estudiante e=new Estudiante();// hacer 4 estudiantes y agregarlos a la lista
			e.setApe("12");
			e.setNom("34");
			e.setComision(5);
			e.setEmail("67");
			e.setDirec("89");
			lista.agregarFinal(e);
		}
		
		Estudiante[] arrayE=new Estudiante[2];//crear un vector y agregarlo utilizando mi metodo
		for(int i=0;i<2;i++) {// cargo el vector
			Estudiante e=new Estudiante();
			e.setApe("00");
			e.setNom("00");
			e.setComision(0);
			e.setEmail("00");
			e.setDirec("00");
			arrayE[i]=e;
		}
		lista.agregar(arrayE);//lo agrego
		lista.comenzar();//lo preparo para recorrer
		while(!lista.fin()) {
			System.out.println(lista.proximo().tusDatos());
		}
		
	}
}
// 2.4 a) La generica acepta cualquier tipo de dato, la de enteros solo acepta como su nombre dice entero.	
// b) Se genera igual que los nodos de enteros pero tiene una T dato donde T va a aceptar el tipo que le demos, 
// y va a tener un siguiente de tipo T. Se setea recibiendo T de tipo dato y haciendole this.dato=dato.
//c) El metodo elemento() devuelve el elemento en la posicion que se le pase.
// d) Implementado! Y Funcional :)

