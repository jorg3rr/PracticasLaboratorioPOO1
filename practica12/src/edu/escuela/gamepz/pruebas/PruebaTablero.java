package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombi;
import edu.escuela.gamepz.utils.*;
public class PruebaTablero{
	public static void main(String[] args) {
		Personaje[] datos = {
			new Planta("David",100),
			new Zombi("Bianca"),
			new Planta("Fabian",10,Escudo.MEDIO),
			new Planta("Almendra",50),
			new Planta("Ricardo",Escudo.BAJO),
			new Planta("Silvia"),
			new Zombi("Armando",80,false),
			new Zombi("Josseline",true),
			new Zombi("Eduardo")};
		for (Personaje p: datos) {
				int pos = (int)(Math.random()*20 - 5);
				try{
					Tablero.insertar(p,pos);
				}catch(PersException pe){
					System.err.println(pe.getMessage() + " " + pe.getPoss());
				}
		}//for
		Tablero.mostrar();
		for (int i = 0; i < Tablero.MAX_SIZE; i++) {
			int pos = (int)(Math.random()*20 - 5);
			try{
				Tablero.borrar(pos);
			}catch(PersException pe){
				System.err.println(pe.getMessage() + " " + pe.getPoss());
			}
		}
		Tablero.mostrar();
	}
}