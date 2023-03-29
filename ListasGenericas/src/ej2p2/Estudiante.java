package ej2p2;

public class Estudiante {
	String nom;
	String ape;
	int comision;
	String email;
	String direc;
	
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
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}
	public String tusDatos() {
		return "Nombre: "+nom+" Apellido: "+ape+" Comision: "+comision+" Email: "+email+" Direccion: "+direc;
	}
}
