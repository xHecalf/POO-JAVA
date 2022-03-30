//Hector Alfonso
import java.util.Random;

public class Practica_Extra7 {
    public static void main(String[] args) {
        
        //Ejercicio1
        int[] integerArray1 = {1,20,3,44,5,60,7,88,9,100};
        System.out.println("El elemento de la posición 5 es: "+integerArray1[5]);
        
        
        //Ejercicio2
        int[] arreglo1 = {0,0,0,0,0};
        System.out.println("\nPrimer arreglo de ceros: "+arreglo1[0]+"|"+arreglo1[1]+
                "|"+arreglo1[2]+"|"+arreglo1[3]+"|"+arreglo1[4]);
        
        Random random = new Random();
        int[] arreglo2 = new int[5];
        arreglo2[0] = random.nextInt();
        arreglo2[1] = random.nextInt();
        arreglo2[2] = random.nextInt();
        arreglo2[3] = random.nextInt();
        arreglo2[4] = random.nextInt();
        System.out.println("Segundo arreglo de numeros aleatorios: "+arreglo2[0]+"|"
                +arreglo2[1]+"|"+arreglo2[2]+"|"+arreglo2[3]+"|"+arreglo2[4]);
       
        //Ejercicio3
        clase objeto1 = new clase();
        clase objeto2 = new clase();
        clase objeto3 = new clase();
        clase[] array = {new clase(), new clase(), new clase()};
        
        //Ejercicio4
        Dog perro = new Dog("Zeus", 5);
        perro.eat();
        
    }
    //Ejercicio3
        static public class clase {
            public clase(){
            }
        }
        
    //Ejercicio4
        public class Animal{
            String name;
            int age;
            
            public Animal(String name, int age){
                this.name = name;
                this.age = age;
            }
            public void eat(){
                System.out.println(name + " is eating");
            }
            public void sleep(){
                System.out.println(name+ " is sleeping");
            }
        }
        static public class Dog extends Animal{
            public Dog (String name, int age){
        }
            public void bark(){
                System.out.println(name + ": woof woof");
            }
       //Ejercicio 5
        public class Horse extends Animal{
            public Horse(String name, int age){
                
            }
            public void bray(){
                System.out.println(name + ": hrrr ");
            }
        }
}
}
