package edu.escuela.gamepz.pruebas;
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
		Planta plan04 = new Planta("Silvia ");
		Zombie zom01 = new Zombie("Armando ",80,false);
		Zombie zom02 = new Zombie("Josseline ",true);
		Zombie zom03 = new Zombie("Eduardo ");


		Personaje personajes[] = {new Personaje("David ",100),
			new Personaje("Bianca"),
			new Planta("Fabian",10,'B'),
			new Planta("Almendra",50),
			new Planta("Ricardo",'C'),
			new Planta("Silvia"),
			new Zombie("Armando",80,false),
			new Zombie("Josseline",true),
			new Zombie("Eduardo")};

		for (Personaje tmp: personajes) {
			System.out.println(tmp.getDetalle());
			int n = (int)(Math.random()*100);
			
			if (tmp instanceof Planta) {
				System.out.println("Soy Planta" + " " +((Planta)tmp).getEscudo());
				tmp.addVida(n);
			}
			if (tmp instanceof Zombie) {
				System.out.println("Soy Zombie" + "\t"+((Zombie)tmp).getAtaque());
				tmp.decVida(n);
			}
			System.out.println(n);
			System.out.println(tmp.getDetalle());
			System.out.println("***** Objeto " + n + "*****");
		}
	}
}