package practica2extras;

public class Clase {
       String nombre;
       int edad;
       
       
    /* Ejercicio 1: Implementa una clase con un constructor privado y ve que sucede. */
    private Clase(){
        nombre = "Ana";
        edad = 10;
    }
       
    /*Ejercicio 2: Haz un constructor con parámetros. */   
    public Clase(String n, int e){
        nombre = n;
        edad = e;
    }
    
    /* Ejercicio 3: Haz un constructor con parámetros que usen los mismos nombres que los atributos de la
    clase, un método que imprima los valores de las clases y vea si los valores se asignaron correctamente.
    public Clase(int edad, String nombre){
        nombre = nombre;
        edad = edad;
    }
    
    public void imprimir(){
        System.out.println("Nombre:"+nombre+"   Edad:"+edad);
    }
    
    /*Ejercicio 4: Modifique el constructor que realizó en el último ejercicio agregando la palabra clave * "this"
    y verifique si los resultados son diferentes. */
    
    public Clase(int edad, String nombre){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void imprimir(){
        System.out.println("Nombre:"+nombre+"   Edad:"+edad);
    }
}
