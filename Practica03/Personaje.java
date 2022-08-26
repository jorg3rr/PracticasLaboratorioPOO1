public class Personaje{
	//Atrbutos de tipo cadena
	private String nombre;
	private String edad;
	 
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	//Regresa una cadena con el valor del nombre 
	public String getNombre(){
		return nombre;
	}
	
	public void saludar(){
	System.out.println("Hola Alumno de POO" + nombre);
	}	
}