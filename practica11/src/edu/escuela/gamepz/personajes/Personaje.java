package edu.escuela.gamepz.personajes;

public abstract class Personaje{
    private String nombre;
    protected int vida;

    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        vida = 3;
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
    public abstract void decVida();/*{
        if ((vida-1 > 0) && (vida-1 < 100)){
            vida = vida - 1;
        }
    }*/

    public abstract void decVida(int dec);/*{
        if ((vida-dec > 0) && (vida-dec < 100)){
            vida = vida - dec;
        }
    }*/

    ///Incrementador de Vida
    public abstract void addVida();/*{
        if ((vida+1 > 0) && (vida+1 < 100)){
            vida = vida + 1;
        }
    }*/
    
    public abstract void addVida(int incvida);/*{
        if ((vida+incvida > 0) && (vida+incvida < 100)){
            vida = vida + incvida;
        }
    }*/
    
    /*
    if (vida < 0){
        this.vida = 0;
    }
    if (vida > 99){
        this.vida = 99;
    }
    */

    
}