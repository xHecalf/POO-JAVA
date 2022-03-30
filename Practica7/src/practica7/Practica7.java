package practica7;
//Hector Alfonso

import java.util.Scanner;

public class Practica7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int op;
        
        Bird[] pajaro = new Bird[3];
        pajaro[0] = new Bird.BlueBird();
        pajaro[1] = new Bird.RedBird();
        pajaro[2] = new Bird.YellowBird();
        
        while(!salir){
            
               System.out.println("Eliga el pajaro a lanzar:");
            System.out.println("1| Azul");
            System.out.println("2| Rojo");
            System.out.println("3| Amarillo");
            System.out.println("0| Salir");
            op = scan.nextInt();
            
            switch(op){
                case 1: System.out.println("Ha lanzado a " + pajaro[0].getNombre() + " y se " + pajaro[0].getAtaque()); break;
                case 2: System.out.println("Ha lanzado a " + pajaro[1].getNombre() + " y se " + pajaro[1].getAtaque()); break;
                case 3: System.out.println("Ha lanzado a " + pajaro[2].getNombre() + " y se " + pajaro[2].getAtaque()); break;
                case 0: salir=true; break;
                }
            } 
    }
}