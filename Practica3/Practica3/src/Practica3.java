/*-Hector Alfonso 1280819*/
import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        int op;

        Estudiante[] student = new Estudiante[10];
        Estudiante asign = new Estudiante();

        student[0] = new Estudiante("Juan", "180159", "Programación", 100);
        student[1] = new Estudiante("Pedro", "180157", "Mercadotecnia", 80);
        student[2] = new Estudiante("Angel", "180354", "Quimica", 59);
        student[3] = new Estudiante("Federico", "180549", "Ingles", 60);
        student[4] = new Estudiante("Carlos", "180478", "Física", 52);

        while (!salir) {
            System.out.println("1| Captura de alumnos");
            System.out.println("2| Mostrar alumnos");
            System.out.println("3| Salir");
            System.out.println("Seleccione una opción:");
            op = scan.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("---------------------Captura de alumnos---------------------");

                        for (int i = 5; i < 10; i++) {
                            System.out.println("\nAlumno: "+(i+1)+"");
                            asign.asignarNombre(scan);
                            student[i] = new Estudiante(asign.nombre, asign.id, asign.materia, asign.calificacion);
                        }
                    break;

                    case 2:
                        System.out.println("---------------------Mostrando datos de alumnos---------------------\n");
                        for (int i = 0; i < 10; i++){
                            System.out.println("Alumno "+(1+i)+": "+student[i]+"\n");
                        }
                    break;

                    case 3: salir = true; break;
                }
            }
        }
    }