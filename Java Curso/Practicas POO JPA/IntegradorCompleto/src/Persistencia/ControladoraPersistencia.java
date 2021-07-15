package Persistencia;

import Logica.Producto;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    // Llamar connection a la DB
    ProductoJpaController jpaProducto = new ProductoJpaController();
    
//    *** Methods ***    
    public void altaProducto(Producto myProd){
        try {
            jpaProducto.create(myProd);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
