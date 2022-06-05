package practica10;


public class Cotorro extends Animal {
    
    public Cotorro (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Cotorro");
        setWeight(5);
    }

    public void sing(){
        System.out.println(name + " Comenzo a cantar!");
    }

    @Override
    public void eat(){
        System.out.println(name + " con su hermoso pico encontro semillas.");
    }
    
}
