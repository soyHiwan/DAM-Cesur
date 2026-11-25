public class Informatico {
//variables
	// Los atributos son private para evitar que otras clases
	// puedan modificarlos directamente. Para acceder a ellos
	private String speciality;
//constructor
	public Informatico () {
		
	}	
	public Informatico (String speciality) {
		this.speciality = speciality;
	}	
//metodos
	// utilizamos los getters y setters public.
	public String getSpeciality ( ) {
		return speciality;
	}
	public void setSpeciality ( String speciality ) {
		this.speciality = speciality; 
	}
}
