/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import ejercicio8.Vehiculo;

/**
 *
 * @author padillatom
 */
public class Colectivo extends Vehiculo{
    private boolean aptoDiscapacitados;
    private boolean poseeSube;
    private String tipoColectivo;

    public Colectivo() {
    }

    public Colectivo(boolean aptoDiscapacitados, boolean poseeSube, String tipoColectivo, String patente, int numChasis, String motor, String color, String marca, String modelo, int cantidadAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantidadAsientos);
        this.aptoDiscapacitados = aptoDiscapacitados;
        this.poseeSube = poseeSube;
        this.tipoColectivo = tipoColectivo;
    }

    public boolean isAptoDiscapacitados() {
        return aptoDiscapacitados;
    }

    public void setAptoDiscapacitados(boolean aptoDiscapacitados) {
        this.aptoDiscapacitados = aptoDiscapacitados;
    }

    public boolean isPoseeSube() {
        return poseeSube;
    }

    public void setPoseeSube(boolean poseeSube) {
        this.poseeSube = poseeSube;
    }

    public String getTipoColectivo() {
        return tipoColectivo;
    }

    public void setTipoColectivo(String tipoColectivo) {
        this.tipoColectivo = tipoColectivo;
    }
    
    @Override
    public void mostrar(){
        System.out.println("\nHola soy un COLECTIVO de Asientos: " + this.getCantidadAsientos());
    }
    
}
