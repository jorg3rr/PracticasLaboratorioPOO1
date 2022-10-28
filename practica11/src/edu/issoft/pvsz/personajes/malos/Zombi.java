package edu.issoft.pvsz.personajes.malos;
import edu.issoft.pvsz.personajes.Personaje;

public class Zombi extends Personaje{
    public boolean ataque;

    public boolean getAtaque(){
        return ataque;
    };
    ///Constructores sonbi (si, con s)
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
    public String getDetalle(){
        return super.getDetalle()+" "+ataque;
    }

    ///Decrementos
    ///Decrementos sin atributo
    public void decVida(){
        if (ataque == false){
            super.decVida(3);
        }
        else if (ataque == true){
            super.decVida(2);
        }
    }
    ///Decrementos con Atributos
    public void decVida(int dec){
        if (ataque == false){
            super.decVida(dec*3);
        }
        else if (ataque == true){
            super.decVida(dec*2);
        }
    }
 
    
    ///INCREMENTOS
    ///Incremento sin Atribs
    public void addVida(){
        if (ataque == false){
            super.addVida(0);
        }
        else if (ataque == true){
            super.addVida(0);
        }

    }

    //Incremento con atrib
    public void addVida(int vida){
        if (ataque == true){
            super.addVida(vida *3);
        }
        else if (ataque == false){
            super.addVida(0);
        }
    }

}