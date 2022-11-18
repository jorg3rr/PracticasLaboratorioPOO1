package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Tablero;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.personajes.Personaje;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;
import edu.escuela.gamepz.utils.BySize;
import edu.escuela.gamepz.utils.ByVida;
import java.util.Scanner;
import java.io.File;

public class PruebaColeccion{
	public static void main(String[] args) {
		String path = System.getProperty("user.home") + System.getProperty("file.separator");
		Scanner s = new Scanner(System.in);
		System.out.println("Escribe el nombre del archivo o directorio");
		String fname = "";
		fname = s.nextLine();
		path += fname;
		File f = new File(path);
		if (f.exists()) {
			System.out.println("El archivo existe");
			System.exit(0);
		}
		if (f.isDirectory()) {
			f.mostrarDirectorio();
			System.out.println("Es directorio");
			System.exit(0);
		}
		Personaje[] datos = {
			new Planta("Fabian",Tablero.genVida(), Escudo.MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(), Escudo.BAJO),
			new Zombie("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),
			new Zombie("Armando",Tablero.genVida(),false),
			new Zombie("Dayan",Tablero.genVida(),true),
			new Zombie("Armando",Tablero.genVida())
		};

		TreeSet<Personaje> arbol = new TreeSet<Personaje>();
		for (Personaje tmp : datos ) {
			arbol.add(tmp);
		}

		LinkedList<Personaje> lista = new LinkedList<Personaje>();
		for (Personaje tmp : datos ) {
			lista.add(tmp);
		}

		System.out.println("- - - Orden Natural - - -");
		for (Personaje	p : arbol) {
			System.out.println(p);
		}
		System.out.println("- - - Orden Vida - - -");
		Collections.sort(lista, new ByVida());
		for (Personaje p : lista ) {
			System.out.println(p);
		}
		ArrayList<Personaje> arr = new ArrayList<Personaje>();
		arr.addAll(lista);
		System.out.println("- - - Orden Tamanio - - -");
		Collections.sort(arr, new BySize());
		for (Personaje p : arr) {
			System.out.println(p);
		}
	}
	public static void mostrarDirectorio(File f){

	}
}