//Código de la clase Persona ejemplo aprenderaprogramar.com
package ejemplo;

public class Persona {

	private static final String NOMBRE_POR_DEFECTO = "Unknown";
	private static final String APELLIDOS_POR_DEFECTO = "Unknown";
	private String nombre;
	private String apellidos;
	private int edad;

	public Persona() {
		
		this(NOMBRE_POR_DEFECTO, APELLIDOS_POR_DEFECTO, 0);

	}

	public Persona(String nombre, String apellidos, int edad) {

		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		
	}
	
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

} // Cierre de la clase