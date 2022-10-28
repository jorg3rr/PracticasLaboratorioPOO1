package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombi;
import edu.escuela.gamepz.utils.*;

public class PruebaHerencia{
    public static void main(String[] args) {
        Planta per01 = new Planta("David", 100);
        Zombi per02 = new Zombi("Bianca");
        Planta plan01 = new Planta("Fabian", 10,Escudo.MEDIO);
        Planta plan02 = new Planta("Almendra", 10);
        Planta plan03 = new Planta("Ricardo", Escudo.BAJO);
        Planta plan04 = new Planta("Silvia");
        Zombi zom01 = new Zombi("Armando", 80, false);
        Zombi zom02 = new Zombi("Josseline", true);
        Zombi zom03 = new Zombi("Eduardo");

        Personaje[] personajes = {per01,per02,plan01,plan02,plan03,
            plan04,zom01,zom02,zom03};
        int n = 1;
        for (Personaje tmp : personajes) {
            System.out.println(tmp);
            int x = (int)(Math.random()*100);
            if(tmp instanceof Planta){
                System.out.println("Soy planta " + ((Planta)tmp).getEscudo());
                tmp.addVida(x);
            }

            if (tmp instanceof Zombi) {
                Zombi z = (Zombi)tmp;
                System.out.println("Soy zombi " + ((Zombi)tmp).getAtaque());
                tmp.decVida(x);
                z.comer();
            }
            System.out.println(x);
            System.out.println(tmp);
            System.out.println("***** Objeto " + n + " *****");
            n += 1;         
        }
    }
}