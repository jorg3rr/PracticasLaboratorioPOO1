package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;
public class Planta extends Personaje{
    public Escudo escudo;
    
    public Escudo getEscudo(){
        return escudo;
    }

    ///Constructores importando los atributos de la clase super
    public Planta(String nombre, int vida, Escudo escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, Escudo escudo){
        super(nombre, 3);
        this.escudo = escudo;
    }
    public Planta(String nombre, int vida){
        super(nombre, vida);
        escudo = 0;
    }
    public Planta(String nombre){
        super(nombre, 3);
        escudo = 0;
    }

    ///Detalles de metodo getDetalle
    public String getDetalle(){
        return super.getDetalle() + " " + escudo;
    }
    ///Decrementos
    public void decVida(){
        /*if (escudo == 'A'){
            super.decVida(2);
        } else {
            super.decVida();
        }*/
    }
    public void decVida(int dec){
        /*if (escudo == 'A'){
            super.decVida(dec*2);
        } else {
            super.decVida();
        }*/
    }
    ///Incrementos
    public void addVida(){
        /*if (escudo == 'A'){
            super.addVida(2);
        } else {
            super.decVida();
        }*/
    }

    public void addVida(int incvida){
        /*if (escudo == 'A'){
            super.addVida(incvida*2);
        } else {
            super.decVida();
        }*/
    }



}