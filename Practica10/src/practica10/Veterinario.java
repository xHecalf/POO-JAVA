package practica10;

public class Veterinario {
    String name;
    double salary;

    public Veterinario (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void vaccinate (Animal animal){
        if(!animal.getVaccinated()){
            animal.setVaccinated (true);
            System.out.println(animal.getName() + " fue vacunado");
        }else{
            System.out.println(animal.getName() + " ya esta vacunado!");
        }
    }

    public void takeBloodSample (Animal animal){
        System.out.println(animal.getName() + " le sacaron sangre.");
    }

    public void weighAnimal (Animal animal){
        System.out.println(animal.getName() + " fue pesado");
        System.out.println("Pesa " + animal.getWeight() +" Kilos!");
    }
}
