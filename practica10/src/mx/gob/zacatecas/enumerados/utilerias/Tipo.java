public enum Tipo{
	SERVER("Servidor"),
	WORKSTATITON("Estacion de Trabajo"),
	DESKTOP("Escritorio"),
	LAPTOP("Portatil");

	private String type;
	
	private String getType(){
		return type;
	}
}