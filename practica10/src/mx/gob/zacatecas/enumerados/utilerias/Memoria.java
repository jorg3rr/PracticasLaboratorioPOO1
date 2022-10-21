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
	
	private Memoria(String tipo, float velocidad, int pines){
		this.tipo = tipo;
		this.velocidad = velocidad;
		this.pines = pines;
	}
	//Metodos para regresar los valores
	public String getTipo(){
		return tipo;
	}
	public float getVelocidad(){
		return velocidad;
	}
	public int getPines(){
		return pines;
	}
}