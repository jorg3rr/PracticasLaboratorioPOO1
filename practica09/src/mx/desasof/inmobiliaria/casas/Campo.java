package mx.desasof.inmobiliaria.casas;
public class Campo extends Casa{
	float piscina[] = new float[2];
	public Campo(String tipo, int hab, float costo,float ancho, float largo){
		super(tipo,hab,costo);
	 	piscina[0] = ancho;
	 	piscina[1] = largo;
	 }
	public Campo(String tipo,float ancho, float largo){
		super(tipo);
		piscina[0] = ancho;
	 	piscina[1] = largo;
	}
	public int hashCode(){
		return super.hashCode() *(int)(piscina[0] * piscina[1])/5;
	}
	public boolean equals(Object ob){
		if (super.equals(ob) && (ob instanceof Campo)){
			return true;				
		}
		return false;
	}
	public String toString(){
		return super.toString() + " " + piscina[0] + " " + piscina[1];
	}
}