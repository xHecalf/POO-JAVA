/*-Hector Alfonso 1280819*/
import java.util.Scanner;

public class Estudiante {
    public String nombre;
    public String id;
    public String materia;
    public float calificacion;
    public String estado;

    public Estudiante(String nombre, String id, String materia, float calificacion) {
        this.nombre = nombre;
        this.id = id;
        this.materia = materia;
        this.calificacion = calificacion;
        this.estado = this.Estado(calificacion);
    }

    public Estudiante() {
        this.nombre = null;
        this.id = null;
        this.materia = null;
        this.calificacion = 0;
        this.estado = null;
    }

    public void asignarNombre(Scanner scan) {
        System.out.print("Nombre:");
        this.nombre = scan.next();
        System.out.print("Numero de control:");
        this.id = scan.next();
        System.out.print("Materia:");
        this.materia = scan.next();
        System.out.print("Calificación:");
        this.calificacion = scan.nextFloat();
        this.asignarEstado();
    }

    public String Estado(float calificacion) {
        if (calificacion >= 60)
            return "Aprobado";
        else
            return "Reprobado";
    }

    public String Estado() {
        return Estado(this.calificacion);
    }

    public void asignarEstado() {
        this.estado = this.Estado();
    }

    public String toString() {
        return "Nombre: " + nombre
                + ", Numero de control: " + id
                + ", Materia: " + materia
                + ", Calificacion: " + calificacion
                + ", Estado: " + estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String ncontrol) {
        this.id = ncontrol;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}