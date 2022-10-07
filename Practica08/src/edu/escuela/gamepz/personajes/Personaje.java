package edu.escuela.gamepz.personajes;
public class Personaje{
	//Atrbutos de tipo cadena y entero
	private String nombre;
	private int vida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje(String nombre){
		this(nombre,3);
	}
	
	public void decVida(){
		vida -= 1;
	}
	
	public void decVida(int vida){
		this.vida -= vida;
	}

	public void addVida(){
		vida +=1;
	}
	public void addVida(int vida){
		this.vida += vida;;
	}
	public void setNombre(String nombre){
		if (nombre.length() > 5 && nombre.length() < 25){
			this.nombre = nombre;
		}
		this.vida = vida;
	}

	//Regresa una cadena con el valor del nombre 
	public String getNombre(){
		return nombre;
	}
	
	public int getVida(){
		return vida;
	}
	
	public String getDetalle(){
	  return nombre + "\t" + vida;
	}

	public boolean setVida(int vida){
		if (vida > 0 && vida < 99){
			this.vida = vida;
			return true;
		}else{
			this.vida = 0;
			return false;
		}
	}	
}
/* */
