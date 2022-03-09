//Hector Alfonso 1280819
package practica4;

import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Mexicano persona = new Mexicano();

        System.out.println("Introdusca su primer nombre :");
        persona.asignarNombre1(scan.nextLine());
        
        System.out.println("Introdusca su segundo nombre:");
        persona.asignarNombre2(scan.nextLine());

        System.out.println("Introdusca su primer apellido:");
        persona.asignarApellido1(scan.nextLine());
        
        System.out.println("Introdusca su segundo apellido:");
        persona.asignarApellido2(scan.nextLine());

        System.out.println("Introdusca su genero (Hombre | Mujer):");
        persona.asignarGenero(scan.nextLine());

        System.out.println("Introdusca el estado en donde nació:");
        persona.asignarEstado(scan.nextLine());
        
        System.out.println("\nIntrodusca su fecha de nacimiento.(Introdusca ceros: 01,07...)\n");
        System.out.println("Día:");
        persona.asignarDia(scan.nextLine());
        System.out.println("Mes:");
        persona.asignarMes(scan.nextLine());
        System.out.println("Año:");
        persona.asignarAño(scan.nextLine());
        
        
        persona.metodoCurp(persona.getNombre1(),persona.getNombre2(),persona.getApellido1(),persona.getApellido2(),persona.getGenero(),persona.getEstado(),persona.getDia(),persona.getMes(),persona.getAño());
        persona.metodoRFC(persona.getNombre1(),persona.getNombre2(),persona.getApellido1(),persona.getApellido2(),persona.getGenero(),persona.getEstado(),persona.getDia(),persona.getMes(),persona.getAño());
        scan.close();
        
        
        }
    }
    
    

