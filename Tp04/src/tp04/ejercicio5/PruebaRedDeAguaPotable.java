package tp04.ejercicio5;

public class PruebaRedDeAguaPotable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolGeneral<Integer> arbol = new ArbolGeneral<>(0);//a
        arbol.agregarHijo(new ArbolGeneral<>(1));//b
        ArbolGeneral<Integer> n2 = new ArbolGeneral<>(1);//c
        n2.agregarHijo(new ArbolGeneral<>(2));//f
        ArbolGeneral<Integer> n3 = new ArbolGeneral<>(2);//g
        n3.agregarHijo(new ArbolGeneral<>(3));//l
        arbol.agregarHijo(n2);
        n2.agregarHijo(n3);
        ArbolGeneral<Integer> n4 = new ArbolGeneral<>(1);//d
        n4.agregarHijo(new ArbolGeneral<>(2));//h
        n4.agregarHijo(new ArbolGeneral<>(2));//i
        n4.agregarHijo(new ArbolGeneral<>(2));//k
        ArbolGeneral<Integer> n5 = new ArbolGeneral<>(2);//j
        n5.agregarHijo(new ArbolGeneral<>(3));//m
        n5.agregarHijo(new ArbolGeneral<>(3));//n
        n4.agregarHijo(n5);
        arbol.agregarHijo(n4);
        arbol.agregarHijo(new ArbolGeneral<>(1));//e
        
    	RedDeAguaPotable rd= new RedDeAguaPotable();
    	rd.arbol=arbol;
    	System.out.println(rd.minimoCaudal(1000));
	}


}
