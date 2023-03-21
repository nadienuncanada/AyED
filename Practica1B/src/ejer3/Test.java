package ejer3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante [] Estudiantes = new Estudiante[2];
		Profesor[] Profesores = new Profesor[3];
		Estudiante e1 = new Estudiante();
			e1.setNom("Jorge");
			e1.setApe("Perez");
			e1.setComision(12);
			e1.setEmail("jp@gmail.com");
		Estudiante e2 = new Estudiante();
			e1.setNom("Jorga");
			e1.setApe("Peraz");
			e1.setComision(12);
			e1.setEmail("japa@gmail.com");
			Estudiantes[0]=e1;
			Estudiantes[1]=e2;
		Profesor p1 = new Profesor("Jorgeitor","Sanchez","JS@gmail.com",12,"UNLP");
		Profesor p2 = new Profesor("Pele","Canuto","PC@gmail.com",133,"UNLP");
		Profesor p3 = new Profesor("Arbol","Lopez","AL@gmail.com",14,"UNLP");
		Profesores[0]=p1;
		Profesores[1]=p2;
		Profesores[2]=p3;
		System.out.print(p1.tusDatos());
	}

}
