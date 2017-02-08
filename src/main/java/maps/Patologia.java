package maps;

import java.util.List;

public class Patologia {
	
	private int id_pato;
	private String nombre_pato;
	private String desc_pato;
	private String tratamiento;
	private String causa;
	private List <Sintomas> lista_sintomas;
	
	
	public Patologia(int id_pato, String nombre_pato, String desc_pato, String tratamiento, String causa,
			List<Sintomas> lista_sintomas) {
		super();
		this.id_pato = id_pato;
		this.nombre_pato = nombre_pato;
		this.desc_pato = desc_pato;
		this.tratamiento = tratamiento;
		this.causa = causa;
		this.lista_sintomas = lista_sintomas;
	}


	public List<Sintomas> getLista_sintomas() {
		
		return lista_sintomas;
	}


	public void setLista_sintomas(List<Sintomas> lista_sintomas) {
		this.lista_sintomas = lista_sintomas;
	}

	
	public int getId_pato() {
		return id_pato;
	}
	public void setId_pato(int id_pato) {
		this.id_pato = id_pato;
	}
	public String getNombre_pato() {
		return nombre_pato;
	}
	public void setNombre_pato(String nombre_pato) {
		this.nombre_pato = nombre_pato;
	}
	public String getDesc_pato() {
		return desc_pato;
	}
	public void setDesc_pato(String desc_pato) {
		this.desc_pato = desc_pato;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	
	

}
