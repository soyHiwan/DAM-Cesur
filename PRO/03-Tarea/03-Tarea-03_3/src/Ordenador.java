public class Ordenador {
//variables
	private String id;
	private String marca;
	private String model;
//constructor
	public Ordenador() {
		
	}
	public Ordenador(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}
//metodos
	public String getId () {
		return this.id;
	}
	public void setId (String id) {
		this.id = id;
	}
	public String getMarca () {
		return this.marca;
	}
	public void setMarca (String marca) {
		this.marca = marca;
	}
	public String getModel () {
		return this.model;
	}
	public void setModel (String model) {
		this.model = model;
	}
}
