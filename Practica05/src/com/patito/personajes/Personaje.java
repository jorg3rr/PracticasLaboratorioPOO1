package com.patito.pruebas;
import com.patito.personajes.*;
public class Personaje{
	//Atrbutos de tipo cadena y entero
	private String nombre;
	private int edad;

	public Personaje(String nombre){
		this.nombre = nombre;
		this.edad = 0;
	}
	public void setNombre(String nombre){
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

	public boolean setEdad(int edad){
		if (edad > 0 && edad < 120){
			this.edad = edad;
			return true;
		}else{
			return false;
		}
	}	
}