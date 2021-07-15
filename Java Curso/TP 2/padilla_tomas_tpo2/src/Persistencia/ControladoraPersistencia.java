package Persistencia;

import Logica.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    ClienteJpaController jpaCliente = new ClienteJpaController();
    
    public void altaCliente(Cliente myCliente){
        try {
            jpaCliente.create(myCliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
