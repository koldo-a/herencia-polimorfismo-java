package ejemplo;

import java.util.Calendar; //Ejemplo aprenderaprogramar.com

public class ProfesorInterino extends Profesor {

	private Calendar FechaComienzoInterinidad;

	
	
	public ProfesorInterino() {
		super();
		FechaComienzoInterinidad = Calendar.getInstance();
	}

	public ProfesorInterino(Calendar fechaComienzaInterinidad) {

		super();

		this.FechaComienzoInterinidad = fechaComienzaInterinidad;
	}

	public ProfesorInterino(String nombre, String apellidos, int edad, Calendar fechaComienzaInterinidad) {

		super(nombre, apellidos, edad);

		FechaComienzoInterinidad = fechaComienzaInterinidad;
	}
	public ProfesorInterino(String nombre, int edad, Calendar fechaComienzaInterinidad) {
		
		super(nombre, null, edad);
		
		FechaComienzoInterinidad = fechaComienzaInterinidad;
	}



	public Calendar getFechaComienzoInterinidad() {
		return FechaComienzoInterinidad;
	}

	public void mostrarDatos() {
		super.mostrarDatos();

		System.out.println("---Datos Profesor Interino. Comienzo interinidad: " +
				
				FechaComienzoInterinidad.getTime().toString());
	}

} // Cierre de la clase