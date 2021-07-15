/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.Ej1;

import ejercicio8.Planta;

/**
 *
 * @author padillatom
 */
public class Flor extends Planta{
    private String colorDePetalos;
    private int promedioDePetalos;
    private String colorDePistilo;
    private String variedadDeFlor;
    private String estacionFlorecimiento;

    public Flor() {
    }    

    public Flor(String colorDePetalos, int promedioDePetalos, String colorDePistilo, String variedadDeFlor, String estacionFlorecimiento, String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.promedioDePetalos = promedioDePetalos;
        this.colorDePistilo = colorDePistilo;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionFlorecimiento = estacionFlorecimiento;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public int getPromedioDePetalos() {
        return promedioDePetalos;
    }

    public void setPromedioDePetalos(int promedioDePetalos) {
        this.promedioDePetalos = promedioDePetalos;
    }

    public String getColorDePistilo() {
        return colorDePistilo;
    }

    public void setColorDePistilo(String colorDePistilo) {
        this.colorDePistilo = colorDePistilo;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionFlorecimiento() {
        return estacionFlorecimiento;
    }

    public void setEstacionFlorecimiento(String estacionFlorecimiento) {
        this.estacionFlorecimiento = estacionFlorecimiento;
    }
    
    private void metodoFlor(){
        System.out.println("\nHola soy una FLOR");
    }
    
    
    
    
    
}
