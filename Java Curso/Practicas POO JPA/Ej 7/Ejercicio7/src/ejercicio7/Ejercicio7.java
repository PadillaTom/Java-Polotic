package ejercicio7;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        // Ejercicio A
//        System.out.println("Welcome To Autos: Main");
//        
//        Auto myCar1 = new Auto("Rojo", "Ford", "Escort", "TAP111", 5);
//        Auto myCar2 = new Auto("Verde", "Peugeot", "Autazo", "TAP222", 3);
//        Auto myCar3 = new Auto("Azul", "Chevrolet", "Picolino", "TAP333", 8);
//        Auto myEmptyCar = new Auto();
//        
//        System.out.println("\nMi Auto 1: ");
//        System.out.println("\nMarca: " + myCar1.getMarca());
//        System.out.println("\nModelo: " + myCar1.getModelo());
//        System.out.println("\nPatente: " + myCar1.getPatente());
//        System.out.println("\n****************************");
//        System.out.println("\nMi Auto 2: ");
//        System.out.println("\nMarca: " + myCar2.getMarca());
//        System.out.println("\nModelo: " + myCar2.getModelo());
//        System.out.println("\nPatente: " + myCar2.getPatente());
//        System.out.println("\n****************************");
//        System.out.println("\nMi Auto 3: ");
//        System.out.println("\nMarca: " + myCar3.getMarca());
//        System.out.println("\nModelo: " + myCar3.getModelo());
//        System.out.println("\nPatente: " + myCar3.getPatente());
//        System.out.println("\n****************************");
//        
//        System.out.println("\nMi Auto Empty: ");        
//        System.out.println("\nModelo: " + myEmptyCar.getModelo());        
//        System.out.println("\n****************************");

        // Ejercicio B
//        System.out.println("Welcome to Muebles: Main.");
//        
//        Mueble myMueble1 = new Mueble("Silla", 10.5, 10, "Madera", 2);
//        Mueble myMueble2 = new Mueble("Escritorio", 72, 120, "Marmol", 1);
//        Mueble myMueble3 = new Mueble("Cama", 180, 100, "Oak", 1);
//        
//        System.out.println("Algunos Muebles: ");
//        System.out.println("\nMueble 1: " + myMueble1.getNombre() + " // " + myMueble1.getMaterial());
//        System.out.println("\nMueble 2: " + myMueble2.getNombre() + " // " + myMueble2.getMaterial());
//        System.out.println("\nMueble 3: " + myMueble3.getNombre() + " // " + myMueble3.getMaterial());
//        
//        myMueble1.setMaterial("Madera Piola");
//        myMueble2.setMaterial("Madera Piola");
//        myMueble3.setMaterial("Madera Piola");
//        
//        System.out.println("Muebles Achetados: ");
//        System.out.println("\nMueble 1: " + myMueble1.getNombre() + " // " + myMueble1.getMaterial());
//        System.out.println("\nMueble 2: " + myMueble2.getNombre() + " // " + myMueble2.getMaterial());
//        System.out.println("\nMueble 3: " + myMueble3.getNombre() + " // " + myMueble3.getMaterial());

        // Ejercicio C
        Mascota mascotas[] = new Mascota[5];
        
        Mascota myMascota1 = new Mascota("Tom", "Perro", "m", "Marron", "Lacio", "Boxer");
        Mascota myMascota2 = new Mascota("Katy", "Gato", "m", "Azul", "Rulos", "Cat");
        Mascota myMascota3 = new Mascota("July", "Loro", "f", "Verde", "Corto", "Parrot");
        Mascota myMascota4 = new Mascota("Rafa", "Perro", "f", "Marron", "Lacio", "Aleman");
        Mascota myMascota5 = new Mascota("Bobby", "Iguana", "f", "Azul", "Corto", "Lizard");
        mascotas[0] = myMascota1;
        mascotas[1] = myMascota2;
        mascotas[2] = myMascota3;
        mascotas[3] = myMascota4;
        mascotas[4] = myMascota5;
        
//        Recorrer el vector
        for (int i=0; i<mascotas.length; i++){
            System.out.println("\nNombre: " + mascotas[i].getNombre());
            System.out.println("\nEspecie: " + mascotas[i].getEspecie());
            System.out.println("\nSexo: " + mascotas[i].getSexo());
            System.out.println("***");
        }
        
        myMascota1.setNombre("NuevoTom");
        myMascota3.setNombre("NuevaJuly");
        System.out.println("\nNombres: ");
        System.out.println("\nMascota1: " + myMascota1.getNombre() + " // Mascota3: " + myMascota3.getNombre());
        
        for(int i=0; i<mascotas.length; i++){
            if(mascotas[i].getEspecie() == "Perro"){
                System.out.println(mascotas[i].getNombre());
            }
        }        
    }    
}
