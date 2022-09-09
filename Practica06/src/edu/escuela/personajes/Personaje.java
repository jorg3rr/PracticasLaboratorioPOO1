//Verificar paquetes

package edu.escuela.personajes;

public class Personaje{
	//Atrbutos de tipo cadena y entero
	private String nombre;
	private int edad;

	public Personaje(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void setNombre(String nombre){
		String.length(nombre > 5 && nombre < 25)
		this.nombre = nombre;
		this.edad = edad;
	}

	//Regresa una cadena con el valor del nombre 
	public String getNombre(){
		return nombre;
	}
	
	public void saludar(){
	System.out.println("Hola Alumno de POO" + nombre);
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void getDetalle(){
	System.out.println("Nombre" + "\t" + "Edad");
	}

	public boolean setEdad(int edad){
		if (edad > 0 && edad < 120){
			this.edad = edad;
			return true;
		}else{
			return false;
		}
	}	
}
//java string lenght