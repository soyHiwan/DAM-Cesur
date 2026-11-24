
//code
public class Main {

	public static void main(String[] args) {
	//Crear elementos
		Empleado empleadoEmpty = new Empleado();
		Empleado empleado1 = new Empleado("Marta", "1977-04-20");
		Informatico informaticoEmpty = new Informatico ();
		Informatico informatico1 = new Informatico ("Front End");
		Ordenador ordenadorEmpty = new Ordenador ();
		Ordenador ordenador1 = new Ordenador ("Apple", "Air");
		Componente componenteEmpty = new Componente ();
		Componente componente1 = new Componente ("raton");
	//Mostrar por consola
		System.out.println("Datos empleado Vacio");
		System.out.println("-----------------------------------------------");
		System.out.println("Nombre: " + empleadoEmpty.getName());
		System.out.println("Fecha de Nacimiento: " + empleadoEmpty.getBirthDate());
		System.out.println("");
		System.out.println("Especialidad: " + informaticoEmpty.getSpeciality());
		System.out.print("Dispone de un Ordenador " + ordenadorEmpty.getMarca() + " " + ordenadorEmpty.getModel() );
		System.out.println(" con un " + componenteEmpty.getType());
		System.out.println("");
		System.out.println("Datos empleado");
		System.out.println("-----------------------------------------------");
		System.out.println("Nombre: " + empleado1.getName());
		System.out.println("Fecha de Nacimiento: " + empleado1.getBirthDate());
		System.out.println("Edad: " + empleado1.getAge());
		System.out.println("");
		System.out.println("Especialidad: " + informatico1.getSpeciality());
		System.out.print("Dispone de un Ordenador " + ordenador1.getMarca() + " " + ordenador1.getModel() );
		System.out.println(" con un " + componente1.getType());
		System.out.println("");
		System.out.println("Cambiamos datos empleado");
		System.out.println("-----------------------------------------------");
		empleado1.setName("Antonio");
		empleado1.setBirthDate("1999-04-20");
		informatico1.setSpeciality("Back End");
		ordenador1.setMarca("HP");
		ordenador1.setModel("30hd");
		componente1.setType("monitor");
		System.out.println("Nombre: " + empleado1.getName());
		System.out.println("Fecha de Nacimiento: " + empleado1.getBirthDate());
		System.out.println("Edad: " + empleado1.getAge());
		System.out.println("");
		System.out.println("Especialidad:" + informatico1.getSpeciality());
		System.out.print("Dispone de un Ordenador " + ordenador1.getMarca() + " " + ordenador1.getModel() );
		System.out.println(" con un " + componente1.getType());
	}

}
