package practica5;
import java.util.Random;
        
public class Banco extends Cuenta{
        Cuenta[] cuenta = new Cuenta[20];
        
    public void registrarCuenta (String nombre, float saldo, int PIN){
        for(int i=0;i<20;i++){
           cuenta[i] = new Cuenta(); }
        
        int cont = 0;
        
        this.cuenta[cont].setNombreTitular(nombre);
        this.cuenta[cont].setSaldo(saldo);
        this.cuenta[cont].setPIN(PIN);
       
        Random r = new Random();
        this.cuenta[cont].setNumeroCuenta(10000 + r.nextInt(99999));

        
        System.out.println("-----¡Cuenta creada con exito!-----");
        System.out.println("\nNumero de cuenta: " + this.cuenta[cont].getNumeroCuenta());
        System.out.println("Nombre del titular: " + this.cuenta[cont].getNombreTitular());
        System.out.println("Su PIN: " + this.cuenta[cont].getSaldo());
        System.out.println("Su saldo: " + this.cuenta[cont].getPIN());
        cont++;
    }

    public float accederSaldo(int PIN, int numeroCuenta){
        
        for(int i=0;i<20;i++){
        if((this.cuenta[i].getPIN() == PIN) &&  (this.cuenta[i].getNumeroCuenta() == numeroCuenta)){
            return this.cuenta[i].getSaldo();     
        }else{
            return 0;
        }
    }
            return 0;
    }

}

