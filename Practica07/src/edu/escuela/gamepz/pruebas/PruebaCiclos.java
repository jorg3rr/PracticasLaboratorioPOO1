package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;

public class PruebaCiclos{
	public static void main(String[] args) {
		
		Personaje per01 = new Personaje("Diego",0);
		Personaje per02 = new Personaje("Almendra ",0);
		Personaje per03 = new Personaje("Bianca ",0);
		Personaje per04 = new Personaje("Jordan ",0);

		int n = 0;
		int m = 0;
		
		while(n >= m ){
			n = ((int)(Math.random()*100));
			m = ((int)(Math.random()*100));

		}//cierra while
			System.out.println("n = "+ n);
			System.out.println("m = "+ m);


		for (int i = n ; i < m ;i++ ) {
			int ed = ((int)(Math.random()*250));
			if(per01.setEdad(ed)){
				System.out.println(per01.getDetalle() + " Se modifico la edad");
			}
			else{
				System.out.println(per01.getDetalle() + " Sin modificacion en edad a");
			}break;
		}

	}//cierra main
}//cierra clase