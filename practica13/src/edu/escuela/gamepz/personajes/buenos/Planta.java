package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;
public class Planta extends Personaje{
    public Escudo escudo;
    
    public Escudo getEscudo(){
        return escudo;
    }

    ///Constructores importando los atributos de la clase super
    public Planta(String nombre, int vida, Escudo escudo, float size){
        super(nombre, vida, 0.0f);
        this.escudo = escudo;
    }
    public Planta(String nombre, Escudo escudo){
        super(nombre, 3, 0.0f);
        this.escudo = escudo;
    }
    public Planta(String nombre, int vida){
        super(nombre, vida, 0.0f);
        escudo = Escudo.NULO;
    }
    public Planta(String nombre){
        super(nombre, 3, 0.0f);
        escudo = Escudo.NULO;
    }

    ///Detalles de metodo getDetalle
    public String toString(){
        return super.toString() + " " + escudo.getNivel();
    }
    ///Decrementos
    public void decVida(){
        setVida(vida - escudo.getNivel());
    }
    public void decVida(int nivel){
        setVida(vida - escudo.getNivel()*nivel);
    }
    ///Incrementos
    public void addVida(){
        setVida(vida + escudo.getNivel());
    }

    public void addVida(int nivel){
        setVida(vida + escudo.getNivel()*nivel);


    }

}