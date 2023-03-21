package ejer3;

public class Profesor {
	String nom;
	String ape;
	String email;
	int catedra;
	String facultad;
	
	public Profesor(String vnom,String vape,String vemail,int vcat,String vfac) {
		nom=vnom;
		ape=vape;
		email=vemail;
		catedra=vcat;
		facultad=vfac;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCatedra() {
		return catedra;
	}
	public void setCatedra(int catedra) {
		this.catedra = catedra;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String tusDatos() {
		return "Nombre: "+nom+" Apellido: "+ape+" Catedra: "+catedra+" Email: "+email+" Facultad: "+facultad;
	}
}
