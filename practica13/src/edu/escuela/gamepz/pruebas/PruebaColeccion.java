package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombi;
import edu.escuela.gamepz.utils.*;
public class PruebaColeccion{
	public static void main(String[] args) {
		Personaje[] datos = {
			new Planta("Fabian",Tablero.genVida(),Escudo.MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(),Escudo.BAJO),
			new Zombi("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),
			new Zombi("Armando",Tablero.genVida(),false),
			new Zombi("Dayan",Tablero.genVida(),true),
			new Zombi("Armando",Tablero.genVida())};
	}
}