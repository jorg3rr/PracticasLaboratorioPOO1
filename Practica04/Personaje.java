public class Personaje{
	//Atrbutos de tipo cadena y entero
	private String nombre;
	private boolean edad;

	Personaje edad = new Personaje();
	c.setEdad(0);
	
	public int getEdad();
	public void setEdad(boolean edad){
		this.edad = edad;
		if (e>0 && e<120){
			edad = true;
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