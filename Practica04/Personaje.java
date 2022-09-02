public class Personaje{
	//Atrbutos de tipo cadena y entero
	private String nombre;
	private int edad;

	edad = 0;
	public int getEdad();
	public int setEdad(){
		if (e > 120){
			edad = True;
		}else {
			edad = e;
		}
	}
	 
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