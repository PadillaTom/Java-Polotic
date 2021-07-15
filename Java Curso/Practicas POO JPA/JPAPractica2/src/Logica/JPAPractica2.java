package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

public class JPAPractica2 {

    public static void main(String[] args) {
        
//        Alumno myAlumno = new Alumno("123", "Tomas","Padilla", new Date("09/10/1989"));
//        Alumno myAlumno2 = new Alumno("456", "Katy","Torres", new Date("09/10/1989"));
        
        ControladoraPersistencia myController = new ControladoraPersistencia();
        
//  *** Create ***
//        myController.crearAlumno(myAlumno2);
        
//  *** Destroy ***
//        myController.eliminarAlumno("456");

//  *** Modificar ***
//        myAlumno2.setApellido(("Pirulito"));
//        myAlumno2.setNombre("Pirulais");
//        myController.modificarAlumno(myAlumno2);
        
//  *** Mostrar Alumnos  ***   
//        List<Alumno> myList = myController.traerAlumnos();
//        for(Alumno alu: myList){
//            System.out.println(alu.getNombre());
//        }
//  *** Mostrar Single Alumnos  *** 
        Alumno myAlumno = myController.traerSingleAlumno("456");
        System.out.println(myAlumno.getNombre());


    }
    
}
