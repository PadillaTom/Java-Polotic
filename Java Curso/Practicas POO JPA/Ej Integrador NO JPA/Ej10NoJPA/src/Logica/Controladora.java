
package Logica;

public class Controladora {
    
    Alumno vectorAlu[] = new Alumno[4];
    
//    1) Add Alumno:
    public void agregarAlumno(String dni, String nombre, String apellido){
        // CREAMOS alumno para guardarlo:
        Alumno myAlu = new Alumno();
        
        //Parse STR a INT:
        int dniNumero = Integer.parseInt(dni);        
        // Pasar Data:
        myAlu.setDni(dniNumero);
        myAlu.setNombre(nombre);
        myAlu.setApellido(apellido);   
        
        // Buscar Posicion Vacia en Vector:
        for (int i=0; i<vectorAlu.length; i++){
            
            if(vectorAlu[i] == null){
                // Cargar Alumno:
                vectorAlu[i] = myAlu;
                // Salir del Loop:
                i= vectorAlu.length;
            }  
        }        
    }
    
//    2) Ver Alumno:
    public void verAlumno(){
        
    }
    
    // 3) Traer Alumno:
    public Alumno traerAlumno(int myIndex) {
        return vectorAlu[myIndex];
    }
}
