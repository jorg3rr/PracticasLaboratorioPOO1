package edu.escuela.gamepz.personajes;
import java.text.DecimalFormat;
public abstract class Personaje implements Comparable<Personaje>{
    private String nombre;
    protected int vida;
    private float size;

    public Personaje(String nombre, int vida, float size){
        this.nombre = nombre;
        this.vida = vida;
        if (size == 0.0f){
            this.size = genSize();
        } else {
            this.size = Math.round(size)/100;
        }
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        vida = 3;
        size = 0.0f;
    }
    public float getSize(){
        return size;
    }    
    //Metodo genSize  
    public float genSize(){
        float size = (float) (Math.random()*10);
        DecimalFormat df = new DecimalFormat("#.00");
        size = Float.valueOf(df.format(size));
        return size;
    }

    public int compareTo(Personaje o){
        if (this.nombre.compareTo(o.nombre) !=0) {
            return this.nombre.compareTo(o.nombre);
        }
        if (this.vida == o.vida) {
            return o.vida - this.vida;      
        }
        if (this.size == o.size) {
            return 0;
        }
        return (o.size > this.size ? -1 : 1);
    }
    public void setNombre(String nombre){
        if ((nombre.length() > 3) && (nombre.length() < 20)){
            this.nombre = nombre;
        }
    }

    public String getNombre(){
        return nombre;
    }
    public int getVida(){
        return vida;
    }
    public boolean setVida(int vida){
        if ((vida > 0) && (vida < 100)) {
            this.vida = vida;
            return true;
        } else{
        return false;
        }
    }
    public String toString(){
        return nombre+"\t"+vida;
    }
    ///Decrementador de Vida
    public abstract void decVida();
    public abstract void decVida(int dec);
    //Aumentador de Vida
    public abstract void addVida();
    public abstract void addVida(int incvida);    
}