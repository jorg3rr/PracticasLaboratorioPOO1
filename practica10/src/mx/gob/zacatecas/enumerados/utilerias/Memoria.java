package mx.gob.zacatecas.enumerados.utilerias;
public enum Memoria{

	DDR("Memoria Ram",166.0f,30),
	DDR2("Laptop",240.0f,35),
	DDR3("Laptop Nueva",533.0f,40),
	DDR4("Texto Gamer",1600.0f,40);
	//Atributos
	private String tipo;
	private float velocidad;
	private int pines;
	//Metodos para regresar los valores
	private String getTipo(){
		return tipo;
	}
	private float getVelocidad(){
		return velocidad;
	}
	private int getPines(){
		return pines;
	}
}