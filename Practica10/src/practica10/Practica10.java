package practica10;
//Hector Alfonso
import java.util.ArrayList;
public class Practica10 {
    public static void main(String[] args) {
        
        Veterinario vet = new Veterinario("Juanito", 1); 

        
        ArrayList<Animal> animals= new ArrayList<Animal>(3);

        Animal elephant = new Elefante("Miguelito", 15, true);
        Animal monkey = new Mono("Lucy", 10, false);
        Animal bird = new Cotorro("Remedador", 15, false);

        addAnimal(elephant, animals);
        addAnimal(monkey, animals);
        addAnimal(bird, animals);
        showAnimals(animals);

        
        vet.vaccinate(elephant);
        vet.vaccinate(monkey);
        vet.vaccinate(bird);
    }

        
        public static void addAnimal(Animal animal, ArrayList<Animal> animals){
            animals.add(animal);
        }
        
         
        public static void removeAnimal(Animal animal, ArrayList<Animal> animals){
            animals.remove(animal);
        }
    
        
        public static void showAnimals(ArrayList<Animal> animals){
            for(int i=0; i<animals.size(); i++){
                System.out.printf("Tipo de animal: %s\n", animals.get(i).getType());
                System.out.printf("Nombre del animal: %s\n", animals.get(i).getName()); 
                System.out.printf("Edad del animal: %d\n\n", animals.get(i).getAge()); 
            } 
        }
    }