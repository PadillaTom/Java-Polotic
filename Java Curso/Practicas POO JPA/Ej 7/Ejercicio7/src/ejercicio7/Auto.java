package ejercicio7;

public class Auto {
    private String color;
    private String marca;
    private String modelo;
    private String patente;
    private int qtyPuertas;

    public Auto (){
        
    }
    public Auto(String color, String marca, String modelo, String patente, int qtyPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.qtyPuertas = qtyPuertas;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public int getQtyPuertas() {
        return qtyPuertas;
    }
    public void setQtyPuertas(int qtyPuertas) {
        this.qtyPuertas = qtyPuertas;
    } 
}
