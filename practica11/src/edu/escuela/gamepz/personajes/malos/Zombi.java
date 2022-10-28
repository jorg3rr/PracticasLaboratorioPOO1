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
        super(nombre, vida);
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

    ///Metodo obtener detalles
    public String toString(){
        return super.toString() + " " + ataque;
    }
    //Metodo comer
    public void comer(){
        System.out.println("Come cerebros");
    }

    ///Decrementos
    ///Decrementos sin atributo
    public void decVida(){
        if (ataque == false){
            decVida(3);
        }
        else if (ataque == true){
            decVida(2);
        }
    }
    ///Decrementos con Atributos
    public void decVida(int dec){
        if (ataque == false){
            decVida(dec*3);
        }
        else if (ataque == true){
            decVida(dec*2);
        }
    }
 
    
    ///INCREMENTOS
    ///Incremento sin Atribs
    public void addVida(){
        if (ataque == false){
            addVida(0);
        }
        else if (ataque == true){
            addVida(0);
        }

    }

    //Incremento con atrib
    public void addVida(int vida){
        if (ataque == true){
            addVida(vida *3);
        }
        else if (ataque == false){
            addVida(0);
        }
    }
}