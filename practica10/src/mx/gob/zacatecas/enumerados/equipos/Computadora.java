package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class Computadora{
	private String marca;
	private Tipo tipo;
	private Memoria memoria;
	//Constructor
	public Computadora(String marca, Tipo tipo, Memoria memoria){
		this.marca = marca;
		this.tipo = tipo;
		this.memoria = memoria;
	}
	public String getMarca(){
		return marca;
	}
	//toString -Marca, tipo de memoria, velocidad, los pines y el tipo de computadora
	public String toString(){
		return marca + " " + memoria.getTipo() + " " + memoria.getVelocidad() + " " + 
		memoria.getPines() + " " + tipo.getType();
	}
}