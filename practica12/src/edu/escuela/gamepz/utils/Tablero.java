package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje; 
public class Tablero{
	public static int MAX_SIZE = 10;
	static Personaje[] personajes = new Personaje[MAX_SIZE]; 
	private Tablero(int MAX_SIZE){
		this.MAX_SIZE = MAX_SIZE;
	}
	public static void mostrar(){
		System.out.println("\nInicio * * * Contenido del arreglo en Tablero");
		for (Personaje tmp: personajes) {
			int cont = 0;
			if (tmp == null) {
				System.out.println(personajes[cont] + "---");
			}else{
				System.out.println(personajes[cont] + " " + personajes);
			}
			cont += 1;
			System.out.println("Fin * * * Contenido del arreglo en Tablero\n");
		}
	}
	
	public static void insertar(Personaje p, int pos)throws PersException{
		if (pos < 0 || pos > MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);  
		}
		personajes[pos] = p;
	}

	public static void borrar(int pos)throws PersException{
		if (pos < 0 || pos > MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);  	
		}
		if (personajes[pos] == null) {
			throw new PersException("Si personaje para borrar",pos);	
		}
		personajes[pos] = null;
	}

}