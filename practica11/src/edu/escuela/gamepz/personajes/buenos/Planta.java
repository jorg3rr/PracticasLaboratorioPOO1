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
        escudo = Escudo.NULO;
    }
    public Planta(String nombre){
        super(nombre, 3);
        escudo = Escudo.NULO;
    }

    ///Detalles de metodo getDetalle
    public String toString(){
        return super.toString() + " " + escudo.getNivel();
    }
    ///Decrementos
    public void decVida(){
        vida = (vida - escudo.getNivel());
        if (escudo = escudo.getNivel()) {
        vida = (vida - escudo.getNivel())*escudo.getNivel();
        }
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