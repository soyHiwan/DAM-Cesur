
public class Tarea02 {

	public static void main(String[] args) {
		
		 int dato = 2;

	        while (dato < 100) {

	            int dato2 = 1;

	            while (dato2 < dato) {

	                int dato3 = dato2;

	                System.out.println("dato2 = " + dato2);

	                System.out.println("dato3 inicial = " + dato3);

	                if (dato3 < dato) {

	                    dato3 = dato3+1;

	                    System.out.println("dato3 actualizado = " + dato3);

	                }

	            }

	            // dato3 está fuera de su ámbito

	            dato = dato * dato2;

	        }

	        // dato2 y dato3 están fuera de su ámbito

	        System.out.println("Fin del algoritmo. Valor final:");

	        System.out.println("dato = " + dato);

	}

}
