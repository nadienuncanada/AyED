package tp04.ejercicio5;

public class AreaEmpresa {
	private  String id;
	private int tardanza;
	
	public AreaEmpresa(String ID,int Ta) {
		this.id=ID;
		this.tardanza=Ta;
	}

	public int getTardanza() {
		return tardanza;
	}

	public String getId() {
		return id;
	}
}
