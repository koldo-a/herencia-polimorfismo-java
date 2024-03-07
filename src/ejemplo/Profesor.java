package ejemplo;

public class Profesor extends Persona { // Ejemplo aprenderaprogramar.com

	private String IdProfesor;

	public Profesor() {
		super();

		IdProfesor = "Unknown";
	}

	public Profesor(String nombre, String apellidos, int edad) {

		super(nombre, apellidos, edad);

		IdProfesor = "Unknown";
	}

	public void setIdProfesor(String IdProfesor) {
		if(IdProfesor == null || IdProfesor.isBlank()) {
			this.IdProfesor = null;
			return;
		}
		this.IdProfesor = IdProfesor;
	}

	public String getIdProfesor() {
		return IdProfesor;
	}

	public void mostrarDatos() {

		System.out.println("Datos Profesor. Profesor de nombre: " + getNombre() + " " + getApellidos() +

				" con Id de profesor: " + getIdProfesor());
	}

} // Cierre de la clase ejemplo aprenderaprogramar.com