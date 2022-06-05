package practica5;
import java.util.Scanner;
//Hector Alfonso

public class Practica5 {
    public static void main(String[] args) {
        
        Cuenta[] cuenta = new Cuenta[20];
        for(int i=0;i<20;i++){
           cuenta[0] = new Cuenta(); }
        
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int op;
        Banco banco = new Banco();
        
        while(!salir){
            System.out.println("-----Eliga una opción:-----");
            System.out.println("1| Crear una cuenta");
            System.out.println("2| Aceder a una cuenta existente");
            System.out.println("0| Salir");
            op = scan.nextInt();
            
            switch(op){
                case 1:
                String nombre;
                int PIN;
                float saldo;
                    
                System.out.println("-----Bienvenido al sistema de creación de cuenta-----");
                System.out.println("Ingrese el nombre de titular:");
                nombre = scan.next();
                System.out.println("Ingrese su PIN (4 digitos):");
                PIN = scan.nextInt();
                System.out.println("Ingrese su saldo disponible");
                saldo = scan.nextFloat();
                
                banco.registrarCuenta(nombre, saldo, PIN);
                
                break;
                    
                case 2: 
                int numeroCuenta, PINAUX;
                System.out.println("Para entrar a su cuenta ingrese su numero de cuenta y PIN:");
                System.out.println("Numero de cuenta:");
                numeroCuenta = scan.nextInt();
                System.out.println("PIN:");
                PINAUX = scan.nextInt();
                
                banco.accederSaldo(PINAUX, numeroCuenta);
                
                
                boolean salir2 = false;
                int op2;
                while(!salir2){
                    System.out.println("\n-----Eliga una opción:-----");
                    System.out.println("1| Depositar");
                    System.out.println("2| Retirar");
                    System.out.println("0| Salir");
                    op2 = scan.nextInt();
                    
                    switch(op2){
                        case 1: System.out.println("\nCuanto vas a depositar: ");
                        float deposito = scan.nextFloat();
                        float nuevoSaldo = cuenta[0].getSaldo() + deposito;
                                cuenta[0].setSaldo(nuevoSaldo);
                            break;

                        case 2: System.out.println("\nCuanto quieres retirar?: ");
                        float retiro = scan.nextFloat();

                                if(retiro <= cuenta[0].getSaldo()){
                                    nuevoSaldo = cuenta[0].getSaldo() - retiro;
                                    cuenta[0].setSaldo(nuevoSaldo);
                                }else{
                                    System.out.println("No tienes suficiente dinero!\n");
                                }
                            break;

                        case 0: salir2=true; break;
                    }
                }
                break;

                case 0: salir=true; break;
                }
            }
        }
}
