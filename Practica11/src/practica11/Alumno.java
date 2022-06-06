package practica11;

public class Alumno {
    String nombre;
    int matricula;
    float calificaciones[] = new float[7];
    float promedioGeneral;

    public Alumno(String nombre, int matricula){
        setNombre(nombre);
        setMatricula(matricula);
    }
    
    public void asignarCalificaciones(float[] Array){
        for(int i=0; i<7; i++){
            setCalificaciones(Array); 
        }
    }

    public void printCalificaciones(){
        for(float cal: calificaciones){
            System.out.println(cal);
        }
    }

    public void printAlumno(Alumno alumno){
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Matricula: " + alumno.getMatricula()); 
        printCalificaciones();
        System.out.println("");
    }

    public void calcularPromedio(){
        float calificacionTemporal = 0;

        for(float cal: calificaciones){
            calificacionTemporal += cal;
        }
        setPromedioGeneral(calificacionTemporal/(calificaciones.length));
    }

    public void escribirAlumno(){
        Escribir.EscribirTxt("Nombre: "+ getNombre());
        System.out.println("Nombre: " + getNombre());

        Escribir.EscribirTxt("Matricula: "+ Integer.toString(getMatricula()));
        System.out.println("Matricula: " + getMatricula());

        Escribir.EscribirTxt("Calificaciones:");
        System.out.println("Calificaciones:");
        for(int i=0; i<7; i++){
            System.out.println(calificaciones[i]);
            Escribir.EscribirTxt(Float.toString(calificaciones[i]));
        }
        System.out.println("Promedio General: " + getPromedioGeneral());
        Escribir.EscribirTxt("Promedio General: "+ Float.toString(getPromedioGeneral()));
        System.out.println("\n");
        Escribir.EscribirTxt("\n");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setCalificaciones(float[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    public float[] getCalificaciones() {
        return calificaciones;
    }

    public void setPromedioGeneral(float promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }
    public float getPromedioGeneral() {
        calcularPromedio();
        return promedioGeneral;
    }
    
}
