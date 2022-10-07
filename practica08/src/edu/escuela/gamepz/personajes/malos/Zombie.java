package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;

public class Zombie extends Personaje{
	private boolean ataque;
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		super(nombre,3);
		this.ataque = ataque;
	}
	public Zombie(String nombre){
		super(nombre,3);
		ataque = false;
	}
	public boolean getAtaque(){
		return ataque;
	}
	public String getDetalle(){
		return super.getDetalle() + "\t" + ataque;
	}
	//Metodos decVida
	public void decVida(){
		super.decVida();
	}
	public void decVida(int vida){
		super.decVida(vida);
		if (ataque) {
			vida *= 3;
		}else{
			if(!ataque){
			vida *=2;
			}
		}
	}
	//Metodos addVida
	public void addVida(){
		super.addVida();
	}
	public void addVida(int vida){
		super.addVida(vida);
		if (!ataque) {
			vida *= 3;
		}else{
			if (ataque) {
				vida *= 0;
			}
		}
	}

}