//imports
import java.time.LocalDate;
import java.time.Period;
//Code
public class Empleado {
//variables
	// Los atributos son private para evitar que otras clases
	// puedan modificarlos directamente. Para acceder a ellos
	private String id;
	private String name;
	private String birthDate;
//constructor
	public Empleado () { 
		
	}
	public Empleado ( String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
//metodos
	// utilizamos los getters y setters public.
	public String getId ( ) {
		return this.id;
	}
	public void setId ( String id) {
		this.id = id;
	}
	public String getName ( ) {
		return this.name;
	}
	public void setName ( String name) {
		this.name = name;
	}
	public String getBirthDate ( ) {
		return this.birthDate;
	}
	public void setBirthDate ( String birthDate) {
		this.birthDate = birthDate;
	}
	public int getAge ( ) {
		LocalDate fechaNacimiento = LocalDate.parse(birthDate);
		LocalDate fechaActual = LocalDate.now();
		Period d = Period.between(fechaNacimiento, fechaActual);
		int age = d.getYears();
		return age;
	}
}
