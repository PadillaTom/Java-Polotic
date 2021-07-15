package ejercicio8;

import Ej2.Auto;
import Ej2.Camion;
import Ej2.Colectivo;
import Ej2.Moto;

public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.println("*** Welcome to Ejercicio 8 ***");
        
//  Repaso A
//        VideoJuego videojuegos[] = new VideoJuego[5];
//        
//        VideoJuego myGame1 = new VideoJuego("a1", "Play1", "PC", 5, "Accion");
//        VideoJuego myGame2 = new VideoJuego("b1", "Play2", "Portable", 2, "Terror");
//        VideoJuego myGame3 = new VideoJuego("c1", "Play3", "PC", 4, "Autos");
//        VideoJuego myGame4 = new VideoJuego("d1", "Play4", "PC", 5, "Accion");
//        VideoJuego myGame5 = new VideoJuego("e1", "Play5", "Portable", 3, "Accion");
//        
//        videojuegos[0]= myGame1;
//        videojuegos[1]= myGame2;
//        videojuegos[2]= myGame3;
//        videojuegos[3]= myGame4;
//        videojuegos[4]= myGame5;
//        
//        System.out.println("\nVideoJuegos: ");
//        for(int i=0; i<videojuegos.length; i++){            
//            System.out.println("\nTitulo: " + videojuegos[i].getTitulo() + " / Consola: " + videojuegos[i].getConsola() + " / Cantidad Players: " + videojuegos[i].getCantidadJugadores());
//            System.out.println("\n******");           
//        }  
//        
//        videojuegos[1].setTitulo("Game2");
//        videojuegos[1].setCantidadJugadores(10);        
//        videojuegos[3].setTitulo("Game4");
//        videojuegos[3].setCantidadJugadores(10);
//        
//        System.out.println("\nVideoJuegos Nueva: ");
//        for(int i=0; i<videojuegos.length; i++){            
//            System.out.println("\nTitulo: " + videojuegos[i].getTitulo() + " / Consola: " + videojuegos[i].getConsola() + " / Cantidad Players: " + videojuegos[i].getCantidadJugadores());
//            System.out.println("\n******");           
//        }  
//        
//        System.out.println("\nPortables: ");
//        for(int i=0; i<videojuegos.length; i++){            
//            if(videojuegos[i].getConsola() == "Portable"){
//                System.out.println(videojuegos[i].getCodigo() + " - "+ videojuegos[i].getTitulo() + " - " + videojuegos[i].getConsola());
//            }      
//        }  

//  EJERCICIO 1:
//    Arbol myArbol = new Arbol();
//    Flor myFlor = new Flor();
//    Arbusto myArbusto = new Arbusto();
//    
//    myArbol.metodoArbol();
//    myFlor.metodoFlor();
//    myArbusto.metodoArbusto();

//  EJERCICIO 2:
        Vehiculo misVehiculos[] = new Vehiculo[9];        
        Auto myVehiculo1 = new Auto();
        Auto myVehiculo2 = new Auto();
        Auto myVehiculo3 = new Auto();
        Moto myVehiculo4 = new Moto();
        Moto myVehiculo5 = new Moto();
        Moto myVehiculo6 = new Moto();
        Colectivo myVehiculo7 = new Colectivo();
        Colectivo myVehiculo8 = new Colectivo();
        Camion myVehiculo9 = new Camion();        
        misVehiculos[0] = myVehiculo1;
        misVehiculos[1] = myVehiculo2;
        misVehiculos[2] = myVehiculo3;
        misVehiculos[3] = myVehiculo4;
        misVehiculos[4] = myVehiculo5;
        misVehiculos[5] = myVehiculo6;
        misVehiculos[6] = myVehiculo7;
        misVehiculos[7] = myVehiculo8;
        misVehiculos[8] = myVehiculo9;

       for (int i=0; i<misVehiculos.length; i++){
           misVehiculos[i].mostrar();
       }
        
    }    
}
