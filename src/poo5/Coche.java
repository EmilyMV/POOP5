package poo5;

/**
 * @author EIMV
 */

public class Coche {
    private String marca,modelo,color,motor,combustible;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
    
    public void avanzar(){
         System.out.println("El coche avanzo"); 
    }
    
    public void retroceder(){
        System.out.println("El coche retrocedio"); 
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String getMotor(){
        return motor;
    }
    
    public void setMotor(String motor){
        this.motor=motor;
    }
    
    public String getCombustible(){
        return combustible;
    }
    
    public void setCombustible(String combustible){
        this.combustible=combustible;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ","
                + " color=" + color + ", motor=" + motor 
                + ", combustible=" + combustible + '}';
    }
}
