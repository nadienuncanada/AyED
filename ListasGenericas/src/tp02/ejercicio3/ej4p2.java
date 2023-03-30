package tp02.ejercicio3;
import java.util.Scanner;
public class ej4p2 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaGenerica<Character> pila= new PilaGenerica<Character>();
		System.out.println("Ingrese Cadena: ");
		String s= entrada.nextLine();//importante que lea nextline y no nex porque los esp cortan la cadena
		if(check(s,pila)){
			System.out.println("Esta balanceado!");
		}
		else {
			System.out.println("No esta balanceado!");
		}
	
	}
	public static boolean check(String s,PilaGenerica<Character> pila){
		boolean ok=true;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='('|c=='{'|c=='[') {
				pila.apilar(s.charAt(i));//vuelve la string i pos en char y lo guarda en la cola;
			}
			else if(c==')'|c=='}'|c==']') {
				char aux=pila.desapilar();
				if (c==')') {
					if(aux!='(') 
						ok=false;	
				}
				else if(c=='}') {
					if(aux!='{') 
						ok=false;
				}
				else if(c==']') {
					if(aux!='[') 
						ok=false;	
				}
			}
		if(!ok)
			break;
		}
		if(pila.esVacia()) {//si al final sale ej: (() va a decir q esta bien pero con esto nos fijamos q no se desapilo todo
			ok=true;
		}
		else
			ok=false;
		return ok;
	}
}
