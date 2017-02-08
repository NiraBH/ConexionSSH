package maps;

public class Sintomas {
	
	int sintoma_id;
	String nombre_sint;
	
	
	
	
	public Sintomas(int sintoma_id, String nombre_sint) {
		super();
		this.sintoma_id = sintoma_id;
		this.nombre_sint = nombre_sint;
	}
	
	public int getSintoma_id() {
		return sintoma_id;
	}
	public void setSintoma_id(int sintoma_id) {
		this.sintoma_id = sintoma_id;
	}
	public String getNombre_sint() {
		return nombre_sint;
	}
	public void setNombre_sint(String nombre_sint) {
		this.nombre_sint = nombre_sint;
	}
	
	

}
