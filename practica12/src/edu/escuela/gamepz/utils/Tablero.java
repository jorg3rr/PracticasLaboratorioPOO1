package edu.escuela.gamepz.utils;
public class Tablero{
	public int MAX_SIZE = 10;
	public Personaje[] personajes = {MAX_SIZE};
	private Tablero(int MAX_SIZE, Personaje personajes){
		this.MAX_SIZE = MAX_SIZE;
		this.personajes = personajes;
	}
}