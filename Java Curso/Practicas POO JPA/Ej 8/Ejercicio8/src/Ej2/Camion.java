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
public class Camion extends Vehiculo{
    private boolean tieneAcoplado;
    private int cantidadEjes;

    public Camion() {
    }

    public Camion(boolean tieneAcoplado, int cantidadEjes, String patente, int numChasis, String motor, String color, String marca, String modelo, int cantidadAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantidadAsientos);
        this.tieneAcoplado = tieneAcoplado;
        this.cantidadEjes = cantidadEjes;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }
    
    @Override
    public void mostrar(){
        System.out.println("\nHola soy un CAMION de Ejes: " + this.getCantidadEjes());
    }
}
