package practica10;

public class Animal {
    String name, type;
    int age, weight;
    boolean vaccinated;

    public Animal(String name, int age, boolean vaccinated){
        setName(name);
        setAge(age);
        setVaccinated(vaccinated);
    }

    public boolean getVaccinated(){
        return vaccinated;
    }
    public void setVaccinated(boolean bool){
        vaccinated = bool;
    }

    public void eat(){
        System.out.println(name + " esta comiendo.");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
