public class Componente {
//variables
	// Los atributos son private para evitar que otras clases
	// puedan modificarlos directamente. Para acceder a ellos
	private String id;
	private String type;
//constructor
	public Componente() {
		
	}
	public Componente( String type) {
		this.type = type;
	}
//metodos
	// utilizamos los getters y setters public.
	public String getId () {
		return this.id;
	}
	public void setId (String id) {
		this.id = id;
	}
	public String getType () {
		return this.type;
	}
	public void setType (String type) {
		this.type = type;
	}
	
}
