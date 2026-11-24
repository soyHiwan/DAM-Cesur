public class Componente {
//variables
	private String id;
	private String type;
//constructor
	public Componente() {
		
	}
	public Componente( String type) {
		this.type = type;
	}
//metodos
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
