package practica11;
//Hector Alfonso

import java.util.ArrayList;

public class Practica11 {
    public static void main(String[] args) {
        //crear 3 instancias del objeto Alumno
        Alumno alumno1 = new Alumno("Hector Cabrera", 1280819);
        Alumno alumno2 = new Alumno("Juan Garcia", 1280976);
        Alumno alumno3 = new Alumno("Pedro Herrera", 1280234);

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);


        String path = "C:\\Users\\hecto\\Desktop\\Programación orientada a objetos\\Practica11\\src\\practica11\\practica11.csv";
        
        for(Alumno alumno: alumnos){
            alumno.asignarCalificaciones(Leer.LeerCSV(path));
            alumno.escribirAlumno();
        }
        System.out.println("Archivo generado exitosamente.");
    }
}
