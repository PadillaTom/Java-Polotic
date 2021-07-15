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
public class Auto extends Vehiculo {
    private String materialAsientos;
    private int cantidadCaballos;

    public Auto() {
    }

    public Auto(String materialAsientos, int cantidadCaballos) {
        this.materialAsientos = materialAsientos;
        this.cantidadCaballos = cantidadCaballos;
    }

    public String getMaterialAsientos() {
        return materialAsientos;
    }

    public void setMaterialAsientos(String materialAsientos) {
        this.materialAsientos = materialAsientos;
    }

    public int getCantidadCaballos() {
        return cantidadCaballos;
    }

    public void setCantidadCaballos(int cantidadCaballos) {
        this.cantidadCaballos = cantidadCaballos;
    }

    @Override
    public void mostrar() {
        System.out.println("\nHola soy un AUTO de marca: " + this.getMarca());
    }
    
    
}
