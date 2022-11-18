package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.utils.*;

public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01 = new Planta("David", 100);
		Personaje per02 = new Zombie("Bianca");
		Planta plan01 = new Planta("Fabian", 10, Escudo.MEDIO);
		Planta plan02 = new Planta("Almendra", 10);
		Planta plan03 = new Planta("Ricardo", Escudo.BAJO);
		Planta plan04 = new Planta("Silvia");
		Zombie zom01 = new Zombie("Armando", 80, false);
		Zombie zom02 = new Zombie("Josseline", true);
		Zombie zom03 = new Zombie("Eduardo");

		Personaje[] personajes = {per01, per02, plan01, plan02,
								plan03, plan04, zom01, zom02, zom03};

		int n = 1;
		for (Personaje tmp : personajes) {
			System.out.println(tmp.toString());
			int x = (int)(Math.random()*100);
			if(tmp instanceof Planta){
				System.out.println("Soy planta " + ((Planta)tmp).getEscudo());
				tmp.addVida(x);
			}

			if (tmp instanceof Zombie) {
				System.out.println("Soy zombie " + ((Zombie)tmp).getAtaque());
				tmp.decVida(x);
				((Zombie)tmp).comer();
			}
			System.out.println(x);
			System.out.println(tmp.toString());
 			System.out.println("***** Objeto " + n + " *****");
 			n += 1;			
		}
	}
}