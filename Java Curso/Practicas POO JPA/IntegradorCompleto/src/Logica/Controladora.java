package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;

public class Controladora {
    ControladoraPersistencia controlPers = new ControladoraPersistencia();
    
//    ALTA PRODUCTO
    public void altaProducto(int cod_prod, String nombre, int cantidad, String marca, String tipo, Date fecha_venc){
        Producto myProd = new Producto();
        myProd.setCod_prod(cod_prod);
        myProd.setNombre(nombre);
        myProd.setCantidad(cantidad);
        myProd.setMarca(marca);
        myProd.setTipo(tipo);
        myProd.setFecha_venc(fecha_venc);
        
        controlPers.altaProducto(myProd);
    }
    
}
