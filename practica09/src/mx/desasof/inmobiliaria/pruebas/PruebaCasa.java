package mx.desasof.inmobiliaria.pruebas;
import mx.desasof.inmobiliaria.casas.Casa;
import mx.desasof.inmobiliaria.casas.Campo;
import mx.desasof.inmobiliaria.casas.Urbana;

public class PruebaCasa{
	public static void main(String[] args) {
		Casa casas[] = {new Casa(" Estandar",3,3000000),
		new Campo(" Cazador",3.5f,10f),
		new Urbana(" Residencia",3,2500000,2),
		new Casa(" Estandar",3,3000000),
		new Campo(" Cazador",3.5f,10),
		new Urbana(" Residencia",3,2500000,2),
		new Casa(" Estandar"),
		new Campo(" Cazador",4,15000,3f,5f),
		new Urbana(" Residencia",5)};

		int i = 0;
		while (i<casas.length){
			for (Casa c:casas) {
				if (c == (casas[i])) {
				 	System.out.println((casas[i]) + " Son el mismo objeto" + c);
				 	System.out.println(" = = = = = ");
				 	break;
				 }
				 if (c.equals(casas[i])) {
				 	System.out.println((casas[i]) + " Son Iguales" + c);
				 	System.out.println(" e e e e e ");
				 	break;
				 }
				 	System.out.println((casas[i]) + " Son diferentes " + c);
				 	System.out.println(" ! ! ! ! ! ");
			}//for
			i++;
		}//while
	}
}