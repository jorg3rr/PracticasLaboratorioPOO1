package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;

public class Tablero{
	public static final int MAX_SIZE = 10;

	static Personaje[] personajes = new Personaje[MAX_SIZE];

	private Tablero(){}

	public static void mostrar(){
		System.out.println("\nInicio***Contenido del arreglo en Tablero ");

		int n = 0;
		for (Personaje tmp : personajes ) {

			if (tmp == null) {
				System.out.println(n + "---");
			}//cierra if

			System.out.println(n + " " + tmp);

			n += 1;
		}//cierra for

		System.out.println("Fin***Contenido del arreglo en Tablero\n");
	}

	public static void insertar(Personaje p, int pos) throws PersException{
		if (pos <= 0 || pos >= MAX_SIZE) {
			throw new PersException("Indice fuera de rango", pos);
		}

		personajes[pos] = p;		
	}

	public static void borrar(int pos) throws PersException{
		if (pos <= 0 || pos >= MAX_SIZE) {
			throw new PersException("Indice fuera del rango", pos);
		}

		if (personajes[pos] == null){
			throw new PersException("Si personaje para borrar", pos);
		}
	}

	public static int genVida(){
		return (int)(Math.random() * 10 + 1);
	}
}