package tp04.ejercicio5;
import tp04.ejercicio1.*;
import tp02.ejercicio2.*;
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaEmpresa m=new AreaEmpresa("m",14);
		AreaEmpresa l=new AreaEmpresa("l",10);
		AreaEmpresa g=new AreaEmpresa("g",9);
		AreaEmpresa h=new AreaEmpresa("h",12);
		AreaEmpresa i=new AreaEmpresa("i",19);
		AreaEmpresa k=new AreaEmpresa("k",25);
		AreaEmpresa d=new AreaEmpresa("d",6);
		AreaEmpresa e=new AreaEmpresa("e",10);
		AreaEmpresa f=new AreaEmpresa("f",18);
		AreaEmpresa j=new AreaEmpresa("j",13);
		AreaEmpresa a=new AreaEmpresa("a",4);
		AreaEmpresa b=new AreaEmpresa("b",7);
		AreaEmpresa c=new AreaEmpresa("c",5);

		ArbolGeneral<AreaEmpresa> arbol = new ArbolGeneral<AreaEmpresa>(m);
        ArbolGeneral<AreaEmpresa> n1 = new ArbolGeneral<>(l);
        arbol.agregarHijo(n1);
        n1.agregarHijo(new ArbolGeneral<>(g));
        n1.agregarHijo(new ArbolGeneral<>(h));
        n1.agregarHijo(new ArbolGeneral<>(i));
        ArbolGeneral<AreaEmpresa> n2 = new ArbolGeneral<>(k);
        arbol.agregarHijo(n2);
        n2.agregarHijo(new ArbolGeneral<>(d));
        n2.agregarHijo(new ArbolGeneral<>(e));
        n2.agregarHijo(new ArbolGeneral<>(f));
        ArbolGeneral<AreaEmpresa> n3 = new ArbolGeneral<>(j);
        arbol.agregarHijo(n3);
        n3.agregarHijo(new ArbolGeneral<>(a));
        n3.agregarHijo(new ArbolGeneral<>(b));
        n3.agregarHijo(new ArbolGeneral<>(c));
        Recorrido r=new Recorrido();
    	System.out.println("Promedio Maximo "+r.devolverMaximoPromedio(arbol));
	}
	
}
