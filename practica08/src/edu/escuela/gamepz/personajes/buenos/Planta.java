package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;

public class Planta extends Personaje{
	private char escudo;
	
	public Planta(String nombre, int vida, char escudo){
		super(nombre,vida);
		this.escudo = escudo;
		vida = 3;
	}
	public Planta(String nombre,char escudo){
		super(nombre,escudo);
	}
	public Planta(String nombre, int vida){
		super(nombre,vida);
		escudo = 'A';
	}
	public Planta(String nombre){
		super(nombre,3);
		escudo = 'A';
	}
	public String getDetalle(){
		return super.getDetalle() + "\t" + escudo;
	}
	/*public char getEscudo(){
		return escudo;
	}*/
	//Metodos dec
	public void decVida(){
		if (escudo == 'A') {
			decVida(1);
		}
	}
	public void decVida(int vida){
		super.decVida(vida);
		if (escudo == 'A') {
			vida *= 2;
		}
	}
	//Metodos add
	public void addVida(){
		if (escudo == 'A') {
			addVida(1);
		};
	}
	public void addVida(int vida){
		super.addVida(vida);
		if (escudo == 'A') {
			vida *= 2;
		}
	}
}