/*-Hector Alfonso 1280819*/
import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Mexicano persona = new Mexicano();

        System.out.println("Introdusca su primer nombre:\n");
        persona.asignarNombre1(scan.nextLine());

        System.out.println("Introdusca su segundo nombre:\n");
        persona.asignarNombre2(scan.nextLine());

        System.out.println("Introdusca su primer apellido:\n");
        persona.asignarApellido1(scan.nextLine());
        
        System.out.println("Introdusca su segundo apellido:\n");
        persona.asignarApellido2(scan.nextLine());

        System.out.println("Introdusca su genero (Hombre | Mujer):\n");
        persona.asignarGenero(scan.nextLine());

        System.out.println("Introdusca el estado en donde nació:\n");
        persona.asignarEstado(scan.nextLine());
        
        System.out.println("\nIntrodusca su fecha de nacimiento.\n");
        System.out.println("Día:");
        persona.asignarDia(scan.nextLine());
        System.out.println("Mes:");
        persona.asignarMes(scan.nextLine());
        System.out.println("Año:");
        persona.asignarYear(scan.nextLine());


        scan.close();
        }
    }