package Logica;

import Persistencia.ControladoraPersistencia;

public class ControladoraCliente {
    
ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();    
  
    
//    *** Alta Nuevo Cliente ***
    public void altaCliente(
            int num_cliente, 
            String nombre_perro, 
            String raza, 
            String color, 
            String alergico, 
            String atencion_especial, 
            String nombre_duenio, 
            String celular_duenio, 
            String observaciones
    ){
        
        Cliente myCliente = new Cliente();
        
        myCliente.setNum_cliente(num_cliente);
        myCliente.setNombre_perro(nombre_perro);
        myCliente.setRaza(raza);
        myCliente.setColor(color);
        myCliente.setAlergico(alergico);
        myCliente.setAtencion_especial(atencion_especial);
        myCliente.setNombre_duenio(nombre_duenio);
        myCliente.setCelular_duenio(celular_duenio);
        myCliente.setObservaciones(observaciones);
        
        controladoraPersis.altaCliente(myCliente);
        
    }
}
