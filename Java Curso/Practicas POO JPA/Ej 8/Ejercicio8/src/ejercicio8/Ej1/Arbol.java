package ejercicio8.Ej1;

import ejercicio8.Planta;

public class Arbol extends Planta{
    private String variedad;
    private String tipoDeTronco;
    private double radioDeTronco;
    private String tipoDeHojas;  

    public Arbol() {
    }  
    public Arbol(String variedad, String tipoDeTronco, double radioDeTronco, String tipoDeHojas, String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDeTronco = radioDeTronco;
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public double getRadioDeTronco() {
        return radioDeTronco;
    }

    public void setRadioDeTronco(double radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }
    
    private void metodoArbol(){
        System.out.println("\nHola soy un ARBOL");
    }
    
    
}
