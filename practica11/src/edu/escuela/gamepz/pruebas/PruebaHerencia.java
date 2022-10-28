package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombi;

public class PruebaHerencia{
    public static void main(String[] args){
        int contador = 0;
        Random rnd = new Random();
        //personajes
        Personaje per01 = new Personaje("David", 100);
        Personaje per02 = new Personaje("Bianca");
        Planta plan01 = new Planta("Fabian", 10,Escudo.MEDIO);
        Planta plan02 = new Planta("Almendra", 50);
        Planta plan03 = new Planta("Ricardo",Escudo.BAJO);
        Planta plan04 = new Planta("Silvia");
        Zombi zom01 = new Zombi("Armando", 80, false);
        Zombi zom02 = new Zombi("Josseline", true);
        Zombi zom03 = new Zombi("Eduardo");
        //Array
        Personaje personajes [] = new Personaje [9];
        personajes [0] = per01;
        personajes [1] = per02;
        personajes [2] = plan01;
        personajes [3] = plan02;
        personajes [4] = plan03;
        personajes [5] = plan04;
        personajes [6] = zom01;
        personajes [7] = zom02;
        personajes [8] = zom03;

        for (Personaje p : personajes){
            contador = contador + 1;
            System.out.println(p.getDetalle());
            int randnum = rnd.nextInt(100);
            if (randnum == 0){
                randnum = rnd.nextInt(100);
            }
            if (p instanceof Planta){
                Planta rx = (Planta) p;
                System.out.println("Soy Planta");
                System.out.println(rx.getEscudo());
                rx.addVida(randnum);

            }
            if (p instanceof Zombi){
                Zombi rx = (Zombi) p;
                System.out.println("Soy Zombi");
                System.out.println(rx.getAtaque());
                rx.decVida(randnum);
            }
            System.out.println(randnum);
            System.out.println("***Objeto "+ contador+"***");

        }
    

       
    }


/*
        
        //System.out.println("Nombre: " + per04.getNombre()+" Edad: "+per04.getEdad());

        /*
        Personaje per05 = new Personaje("Eloy");
        per05.setNombre("Eloy");
        per05.setEdad(500);
        per05.saludar();
        System.out.println("Nombre: " + per05.getNombre()+" Edad: "+per05.getEdad());

        
        Personaje per06 = per05;
        per06.setNombre("Aratt Esau Juarez Luna");

        Personaje per07 = per04;
        per07.setEdad(999);

        Personaje per08 = per03;
        per08.setNombre("Hanna");

        Personaje per09 = per02;
        per09.setEdad(666);

        Personaje per10 = per01;
        per06.setNombre("Maria Aide");

        System.out.println(" - - - ");

        System.out.println(per01.getDetalle());
        System.out.println(per02.getDetalle());
        System.out.println(per03.getDetalle());
        System.out.println(per04.getDetalle());
        System.out.println(per05.getDetalle());
       

        System.out.println(" - - - ");
    
        Personaje alumno = new Personaje("Kal El");
        alumno.setNombre("Kal El");
        System.out.println("Modificando el nombre " + alumno.getNombre());
        alumno.setNombre("Michael Jordan");
        

        //Esta wea ya es pra la edad
        alumno.saludar();
        if (!alumno.setEdad(30)){
            System.out.println("Edad sin cambios.");
        }
        System.out.println("Nombre: " + alumno.getNombre()+" Edad: "+alumno.getEdad());
        System.out.println("Modificando edad en 130");
        if (!alumno.setEdad(130)){
            System.out.println("Edad sin cambio.");
        }
        System.out.println("Nombre: " + alumno.getNombre()+" Edad: "+alumno.getEdad());
        */
    
}
