package practica10;

public class Elefante extends Animal {
    
    public Elefante (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Elefante");
        setWeight(6853);
    }

    public void honk(){
        System.out.println(name + " Graznido!");
    }

    @Override
    public void eat(){
        System.out.println(name + " Con su larga nariz se arrojó comida a la boca");
    } 
}
