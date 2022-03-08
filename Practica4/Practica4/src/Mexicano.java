/*-Hector Alfonso 1280819*/
import java.util.Scanner;

public class Mexicano {
    public String nombre1;
    public String nombre2;
    public String apellido1;
    public String apellido2;
    public String estado;
    public String genero;
    public int dia;
    public int mes;
    public int año;
    public String CURP;
    public String RFC;

    public Mexicano(String nombre1, String nombre2, String apellido1, String apellido2, String estado, String genero, int dia, int mes, int año, String CURP, String RFC) {
        this.nombre1 = nombre1;
        this.nombre2=nombre2;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.estado=estado;
        this.genero=genero;
        this.dia=dia;
        this.mes=mes;
        this.año=año;
        this.CURP= this.metodoCURP(CURP);
    }

    public Mexicano() {
        this.nombre1 = null;
        this.nombre2=null;
        this.apellido1=null;
        this.apellido2=null;
        this.estado=null;
        this.genero=null;
        this.dia=0;
        this.mes=0;
        this.año=0;
        this.CURP= null;
    }

}