package Logica;

import IGU.Principal;

public class Ej10NoJPA {
    
    public static void main(String[] args) {
        // Creamos CONTROLLER Global:
        Controladora myController = new Controladora();
        // La pasamos a:
            // Principal -> AddAlumnos y VerAlumnos.
            // BackToMain -> Pasa la controladora actualizada.
        
        Principal mainScreen = new Principal(myController);
        mainScreen.setVisible(true);
        mainScreen.setLocationRelativeTo(null);
        
    }
    
}
