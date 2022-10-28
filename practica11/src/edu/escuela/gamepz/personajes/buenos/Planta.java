package edu.issoft.pvsz.personajes.buenos;
import edu.issoft.pvsz.personajes.Personaje;

public class Planta extends Personaje{
    public char escudo;
    
    public char getEscudo(){
        return escudo;
    }

    ///Constructores importando los atributos de la clase super
    public Planta(String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, char escudo){
        super(nombre, 3);
        this.escudo = escudo;
    }
    public Planta(String nombre, int vida){
        super(nombre, vida);
        escudo = 'A';
    }
    public Planta(String nombre){
        super(nombre, 3);
        escudo = 'A';
    }

    ///Detalles de metodo getDetalle
    public String getDetalle(){
        return super.getDetalle() + " " + escudo;
    }
    ///Decrementos
    public void decVida(){
        if (escudo == 'A'){
            super.decVida(2);
        } else {
            super.decVida();
        }
    }
    public void decVida(int dec){
        if (escudo == 'A'){
            super.decVida(dec*2);
        } else {
            super.decVida();
        }
    }
    ///Incrementos
    public void addVida(){
        if (escudo == 'A'){
            super.addVida(2);
        } else {
            super.decVida();
        }
    }

    public void addVida(int incvida){
        if (escudo == 'A'){
            super.addVida(incvida*2);
        } else {
            super.decVida();
        }
    }



}