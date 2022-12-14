//Verificar paquetes

package edu.escuela.gamepz.personajes;

public class Personaje{
	//Atrbutos de tipo cadena y entero
	private String nombre;
	private int edad;

	public Personaje(String nombre){
		this.nombre = nombre;
		edad = 0;
	}
	
	public void setNombre(String nombre){
		if (nombre.length() > 5 && nombre.length() < 25){
			this.nombre = nombre;
		}
		this.edad = edad;
	}

	//Regresa una cadena con el valor del nombre 
	public String getNombre(){
		return nombre;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public String getDetalle(){
	  return nombre + "\t" + edad;
	}

	public boolean setEdad(int edad){
		if (edad > 0 && edad < 120){
			this.edad = edad;
			return true;
		}else{
			this.edad = 0;
			return false;
		}
	}	
}
