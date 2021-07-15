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
public class Moto extends Vehiculo{
    private int cilindrada;
    private String materialManubrio;

    public Moto() {
    }

    public Moto(int cilindrada, String materialManubrio, String patente, int numChasis, String motor, String color, String marca, String modelo, int cantidadAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantidadAsientos);
        this.cilindrada = cilindrada;
        this.materialManubrio = materialManubrio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMaterialManubrio() {
        return materialManubrio;
    }

    public void setMaterialManubrio(String materialManubrio) {
        this.materialManubrio = materialManubrio;
    }
    
    @Override
    public void mostrar(){
        System.out.println("\nHola soy un MOTO de Cilindrada: " + this.getCilindrada());
    }
}
