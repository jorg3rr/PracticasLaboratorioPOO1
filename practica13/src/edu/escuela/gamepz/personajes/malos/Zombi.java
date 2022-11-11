package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Muerto;
public class Zombi extends Personaje implements Muerto{
    public boolean ataque;

    public Zombi(String nombre, int vida, float size, boolean ataque){
        super(nombre, vida, 0.0f);
        this.ataque = ataque;
    }
    public Zombi(String nombre, float size){
        super(nombre, 3, size);
    }

    public Zombi(String nombre, boolean ataque){
        super(nombre, 3, 0.0f);
        this.ataque = ataque;
    }
    public Zombi(String nombre){
        super(nombre, 3, 0.0f);
        ataque = false;
    }
    public boolean getAtaque(){
        return ataque;
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
            setVida(3);
        }
        else if (ataque == true){
            setVida(2);
        }
    }
    ///Decrementos con Atributos
    public void decVida(int dec){
        if (ataque == false){
            setVida(vida - dec*3);
        }
        else if (ataque == true){
            setVida(vida - dec*2);
        }
    }
 
    
    ///INCREMENTOS
    ///Incremento sin Atribs
    public void addVida(){
        if (ataque == false){
            setVida(0);
        }
        else if (ataque == true){
            setVida(0);
        }

    }

    //Incremento con atrib
    public void addVida(int vida){
        if (ataque == true){
            setVida(vida *3);
        }
        else if (ataque == false){
            setVida(0);
        }
    }
}