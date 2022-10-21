package mx.gob.zacatecas.enumerados.pruebas;
import mx.gob.zacatecas.enumerados.equipos.*;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class PruebaComputadora{
	//Crear 4 equipos con los datos que queramos, con diferentes valores de DDR1,2,3,4
	public static void main(String[] args) {
		Computadora c1 = new Computadora("Dell",Tipo.DESKTOP,Memoria.DDR);	
		Smallfactor c2 = new Smallfactor("Hp",Tipo.LAPTOP,Memoria.DDR3,false);	
		Computadora c3 = new Computadora("Lenovo",Tipo.SERVER,Memoria.DDR2);	
		Smallfactor c4 = new Smallfactor("Toshiba",Tipo.WORKSTATITON,Memoria.DDR4,true);		
	
		Computadora equip[] = {c1,c2,c3,c4};

	}
	//fore
}