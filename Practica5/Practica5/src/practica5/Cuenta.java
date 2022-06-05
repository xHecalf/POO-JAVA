package practica5;

public class Cuenta {
    private int PIN, numeroCuenta;
    private String nombreTitular;
    private float saldo;
    
    public Cuenta(){
        this.nombreTitular = null;
        this.PIN = 0;
        this.numeroCuenta = 0;
        this.saldo = 0;
    }
    
    public Cuenta(String nombreTitular, int PIN, int numeroCuenta, float saldo){
        this.nombreTitular = nombreTitular;
        this.PIN = PIN;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public int getPIN(){
        return this.PIN;
    }
    public void setPIN(int PIN){
        this.PIN = PIN;
    }

    public int getNumeroCuenta(){
        return this.numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
     public String getNombreTitular(){
        return this.nombreTitular;
    }
    public void setNombreTitular(String nombreTitular){
        this.nombreTitular = nombreTitular;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

   
}
