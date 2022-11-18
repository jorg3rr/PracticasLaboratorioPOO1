package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.*;
import edu.escuela.gamepz.personajes.Personaje;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class PruebaColeccion{
	public static void main(String[] args) {
		String path = System.getProperty("user.home") + System.getProperty("file.separator");
		Scanner s = new Scanner(System.in);
		System.out.println("Escribe el nombre del archivo o directorio: ");
		String fname = "";
		fname = s.nextLine();
		path += fname;
		File f = new File(path);
		if (f.isFile() && f.exists()) {
			System.out.println("El archivo existe");
			System.exit(0);
		}
		if (f.isDirectory()) {
			mostrarDirectorio(f);
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
		
		guardarObjetos(f,arbol);
		
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
		String[] direc = f.list();
		for (String arc: direc) {
			System.out.println(arc);
		}
	}
	public static void guardarObjetos(File f, TreeSet<Personaje> arbol){
		try {
			FileOutputStream fo = new FileOutputStream (f);
			ObjectOutputStream s = new ObjectOutputStream (fo);
			for (Personaje p: arbol) {
				s.writeObject (p);					
			}
			s.close ();
		} catch (IOException e) {
			e.printStackTrace ();
		}
	}
}