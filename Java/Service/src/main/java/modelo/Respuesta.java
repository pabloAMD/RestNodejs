
package modelo;


public class Respuesta {
    
    private String nombreBanco;
    private String numeroCuenta;
    private double precio;
    
    public Respuesta(){
        
    }

    public Respuesta(String nombreBanco, String numeroCuenta, double precio) {
        this.nombreBanco = nombreBanco;
        this.numeroCuenta = numeroCuenta;
        this.precio = precio;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "nombreBanco=" + nombreBanco + ", numeroCuenta=" + numeroCuenta + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
