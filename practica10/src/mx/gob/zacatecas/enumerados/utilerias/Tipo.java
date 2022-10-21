package mx.gob.zacatecas.enumerados.utilerias;
public enum Tipo{
	SERVER("Servidor"),
	WORKSTATITON("Estacion de Trabajo"),
	DESKTOP("Escritorio"),
	LAPTOP("Portatil");

	private String type;
	
	private Tipo(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
}