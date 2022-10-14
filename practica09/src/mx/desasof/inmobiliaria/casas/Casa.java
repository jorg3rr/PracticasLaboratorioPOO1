package mx.desasof.inmobiliaria.casas;
public class Casa{
	String tipo;
	int hab;
	float costo;
	public Casa(String tipo, int hab, float costo){
		this.tipo = tipo;
		this.hab = hab;
		this.costo = costo;
	}
	public Casa(String tipo){
		this(tipo,2,2000000f);
	}
	public int hashCode{
		return tipo.hashCode() + hab*(int)(costo);
	}
	public boolean equals(Object o){
		if ((o != null) && (o instanceof Casa)){
		//Casteo del objeto
			Casa c = (Casa) o;
			if (tipo.equals(c.tipo) && (costo == c.costo)) {
				return true;				
			}
		}
		return false;
	}
	public String toString(){
		return tipo + " " + hab + " " + costo; 
	}
}