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
			this.nombre = nombre;
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
			return false;
		}
	}	
}
