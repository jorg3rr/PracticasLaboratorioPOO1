//Verificar Paquetes

package edu.escuela.pruebas;
import edu.escuela.personajes.Personaje;

public class PruebaPersonaje{
	public static void main (String[] args){

		Personaje Per01 = new Personaje("Almendra",200);
		Personaje Per02 = new Personaje("Ricardo",10);
		Personaje Per03 = new Personaje("Bianca",1);
		Personaje Per04 = new Personaje("Leonel",-10);
		Personaje Per05 = new Personaje("Hector",500);

		System.out.println(Per01.getDetalle());
		System.out.println(Per02.getDetalle());
		System.out.println(Per03.getDetalle());
		System.out.println(Per04.getDetalle());
		System.out.println(Per05.getDetalle());
		

		//  =(int)(Math.random()*100);



		

		/*alumno.saludar();
		System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
		System.out.println("Modificando el nombre " + alumno.getNombre());
		alumno.setNombre(" Michael Jordan");
		alumno.saludar();
		if(!alumno.setEdad(30)){
			System.out.println("Edad sin cambios");
		}
		System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
		System.out.println("Modificando Edad en 130");
		if (!alumno.setEdad(130)){
				System.out.println("Edad sin cambio");
		}
		System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
*/
	} 
}