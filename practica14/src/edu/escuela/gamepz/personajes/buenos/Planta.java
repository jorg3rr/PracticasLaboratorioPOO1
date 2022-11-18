package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.*;

public class Planta extends Personaje{
	public Escudo escudo;
	
	public Planta(String nombre, int vida,Escudo escudo){
		super(nombre, vida, 0.0f);
		this.escudo = escudo;
	}
	public Planta(String nombre, Escudo escudo){
		super(nombre, 3, 0.0f);
		this.escudo = escudo;
		
	}
	public Planta(String nombre, int vida){
		super(nombre, vida, 0.0f);
		escudo = Escudo.NULO;
	}
	public Planta(String nombre){
		super(nombre,3,0.0f);
		escudo = Escudo.NULO;
	}
	public Escudo getEscudo(){
		return escudo;
	}
	public String toString(){
		return super.toString() + "\t" + escudo.getNivel();
	}
	public void decVida(){
		setVida(vida - escudo.getNivel());
	}
	public void decVida(int n){
		setVida(vida - escudo.getNivel() * n);
	}
	public void addVida(){
		setVida(vida + escudo.getNivel());
	}
	public void addVida(int n){
		setVida(vida + escudo.getNivel() * n);
	}
	// int v = (escudo == 'A')? vidaArg * 2 : vidaArg;
	// super.decVida(v);
}