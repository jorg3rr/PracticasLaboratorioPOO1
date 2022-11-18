package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;

public class Zombie extends Personaje implements Muerto{
	public boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida, 0.0f);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		super(nombre, 3,0.0f);
		this.ataque = ataque;
	}
	public Zombie(String nombre){
		super(nombre, 3,0.0f);
		ataque = false;
	}
	public Zombie(String nombre, float size){
		super(nombre, 3, 0.0f);
	}
	public boolean getAtaque(){
		return ataque;
	}

	public String toString(){
		return super.toString() + "\t" + ataque;
	}

	public void decVida(){
		if(!ataque){
			setVida(vida - 3);
		}
		setVida(vida -2);

	}
	public void decVida(int n){
		if(!ataque){
			setVida(vida - n*3);
		}
		setVida(vida - n*2);
	}
	public void addVida(){
		if(ataque){
			setVida(vida + 3);
		}
	}
	public void addVida(int n){
		if(ataque){
			setVida(vida + n*3);
		}
	}

	public void comer(){
		System.out.println("Come cerebroz");
	}
}