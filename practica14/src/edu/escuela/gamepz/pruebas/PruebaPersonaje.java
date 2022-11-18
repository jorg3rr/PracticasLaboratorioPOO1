package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;

public class PruebaPersonaje{
	public static void main (String[] args){
		Personaje per01 = new Personaje("Almendra", 200);
		Personaje per02 = new Personaje("Ricardo", 10);
		Personaje per03 = new Personaje("Bianca", 1);
		Personaje per04 = new Personaje("Leonel", -10);
		Personaje per05 = new Personaje("Hector", 500);
		
		System.out.println(per01.toString());
		System.out.println(per02.toString());
		System.out.println(per03.toString());
		System.out.println(per04.toString());
		System.out.println(per05.toString());

		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;
		
		per06.setNombre("Francisco Xavier Zepeda Flores");
		per08.setNombre("Dayana");
		per10.setNombre("Axel Fabian Eduardo David");

		int n = ((int)(Math.random()*100));

		per07.setEdad(n);
		per09.setEdad(n);
		
		System.out.println("---");

		System.out.println(per01.toString());
		System.out.println(per02.toString());
		System.out.println(per03.toString());
		System.out.println(per04.toString());
		System.out.println(per05.toString());

	}
}
