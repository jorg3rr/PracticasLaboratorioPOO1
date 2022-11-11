package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
import java.util.Comparator;

public class ByVida implements Comparator<Personaje>{
	public int compare(Personaje p1, Personaje p2){
		if (p1.getVida() != p2.getVida()) {
			return (p1.getVida() > p2.getVida()? -1 : 1); 
		}
		if (p1.getSize() == p2.getSize()) {
			return (p1.getSize() < p2.getSize()? -1 : 1);	
		}
		return p1.getNombre().compareTo(p2.getNombre());
	}
}