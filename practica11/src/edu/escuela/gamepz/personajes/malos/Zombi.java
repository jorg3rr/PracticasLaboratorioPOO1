package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Muerto;

public class Zombi extends Personaje implements Muerto{
    public boolean ataque;

    public boolean getAtaque(){
        return ataque;
    }

    public Zombi(String nombre, int vida, boolean ataque){
        super(nombre, vida, Escudo.NULO);
        this.ataque = ataque;
    }
    public Zombi(String nombre, boolean ataque){
        super(nombre, 3);
        this.ataque = ataque;
    }
    public Zombi(String nombre){
        super(nombre, 3);
        ataque = false;
    }
    public void comer(){
        
    }

    //Metodo toString
    public String toString(){
        return super.toString() + " " + ataque;
    }

    ///Decrementos
        public void decVida(){
        vida = vida - escudo.getNivel();
    }
    public void decVida(int nivel){
        vida = vida - escudo.getNivel()*escudo.getNivel();
    }
    ///Incrementos
    public void addVida(){
        vida = vida + escudo.getNivel();
    }

    public void addVida(int nivel){
        vida = vida + escudo.getNivel()*escudo.getNivel();

    }

}