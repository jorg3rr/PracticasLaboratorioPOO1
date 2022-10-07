package edu.escuela.gamepz.personajes;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.personajes.Personaje;
public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("David ",100);
		Personaje per02 = new Personaje("Bianca ");
		Planta plan01 = new Planta("Fabian ",10,'B');
		Planta plan02 = new Planta("Almendra ",50);
		Planta plan03 = new Planta("Ricardo ",'C');
		Planta plan04 = new Planta("Eduardo ");

	}
}