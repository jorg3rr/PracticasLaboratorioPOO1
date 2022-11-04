package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje; 
public class Tablero{
	public int MAX_SIZE = 10;
	Personaje[] personajes = new Personaje[MAX_SIZE]; 
	private Tablero(int MAX_SIZE){
		this.MAX_SIZE = MAX_SIZE;
	}
	public void mostrar(){
		System.out.println("\nInicio * * * Contenido del arreglo en Tablero");
		for (Personaje tmp: personajes) {
			if (tmp == null) {
				System.out.println(tmp + "---");
			}else{
				System.out.println(tmp + " " + personajes);
			}
			System.out.println("Fin * * * Contenido del arreglo en Tablero\n");
		}
	}
	public void insertar(Personaje p, int pos)throws PersException{
		if (pos < 0 || pos > MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);  
		}else{
			personajes[pos] = p;

		}
	}
}