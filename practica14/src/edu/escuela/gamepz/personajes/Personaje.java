package edu.escuela.gamepz.personajes;
import java.text.DecimalFormat;

public abstract class Personaje implements Comparable<Personaje>{
	private String nombre;
	protected int vida;
	protected float size;

	public Personaje(String nombre, int vida, float size){
		this.nombre = nombre;
		this.vida = vida;
		if (size == 0.0f) {
			this.size = genSize();						
		}else{
			this.size = Math.round(size)/100;
		}
	}
	public Personaje(String nombre){
		this(nombre, 3, 0.0f);
	}
		
	public void setNombre(String nombre){
		if(nombre.length() > 5 && nombre.length() < 25){
			this.nombre= nombre;
		}
	}

	public String getNombre(){
		return nombre;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}
	public int getVida(){
		return vida;
	}

	public boolean setVida(int vida){
		if (vida >1 && vida <100){
			this.vida = vida;
			return true;
		}else{
			return false;
		}
	}
		
	public String toString(){
		return nombre + "\t" + vida + "\t" + size;
	}
	public abstract void decVida();
		
	public abstract void decVida(int n);
		
	public abstract void addVida();
		
	public abstract void addVida(int n);

	public float genSize(){
		float size = (float)(Math.random()*10);
		DecimalFormat df = new DecimalFormat("#.00");
		size = Float.valueOf(df.format(size));
		return size;
	}

	public int compareTo(Personaje	p){
		if (this.nombre.compareTo(p.nombre) != 0) {
			return this.nombre.compareTo(p.nombre);		
		}
		if (this.vida != p.vida) {
			return p.vida  - this.vida ;
		}
		return (this.size  < p.size) ? -1 : 1;
	}

	public float getSize(){
		return size;
	}		
}