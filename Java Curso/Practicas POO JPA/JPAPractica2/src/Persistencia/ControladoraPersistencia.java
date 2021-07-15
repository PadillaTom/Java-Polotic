/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Alumno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author padillatom
 */
public class ControladoraPersistencia {
    AlumnoJpaController aluJPA = new AlumnoJpaController();
    
    
    public void crearAlumno(Alumno alu){
        try {
            aluJPA.create(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarAlumno(String idAlumno){
        try {
            aluJPA.destroy(idAlumno);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarAlumno(Alumno aluModificable){
        try {
            aluJPA.edit(aluModificable);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Alumno> traerAlumnos(){
        List<Alumno> myList = aluJPA.findAlumnoEntities();
        return myList;
    }
    
    public Alumno traerSingleAlumno(String myAluId){
        Alumno myAlu = aluJPA.findAlumno(myAluId);
        return myAlu;
    }
}
