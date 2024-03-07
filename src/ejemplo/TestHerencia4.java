package ejemplo;

import java.util.Calendar; //Ejemplo aprenderaprogramar.com

public class TestHerencia4 {

    public static void main (String [ ] Args) {

        Profesor profesor1 = new Profesor ("Juan", "Hernández García", 33);

        profesor1.setIdProfesor("Prof 22-387-11");

        Calendar fecha1 = Calendar.getInstance();
        Calendar fecha2 = Calendar.getInstance();

        fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representa noviembre
        fecha2.set(2021,02,12); //Los meses van de 0 a 11, luego 10 representa noviembre

        ProfesorInterino interino1 = new ProfesorInterino("José Luis", "Morales Pérez", 54, fecha1);
        interino1.setIdProfesor("Prof 22-777-77");

        ProfesorInterino interino2 = new ProfesorInterino("Luis", 47, fecha2);
        ProfesorInterino interino3 = new ProfesorInterino();
        ListinProfesores listin1 = new ListinProfesores ();

        listin1.addProfesor(profesor1);

        listin1.addProfesor(interino1);
        listin1.addProfesor(interino2);
        listin1.addProfesor(interino3);

        listin1.listar(); } //Cierre del main

} //Cierre de la clase