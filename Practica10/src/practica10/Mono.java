package practica10;

public class Mono extends Animal {
    
    public Mono (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Mono");
        setWeight(20);
    }

    public void climb(){
        System.out.println(name + " esta escalando un árbol!");
    }

    @Override
    public void eat(){
        System.out.println(name + " se le antojaron unas bananas.");
    }
    
}
