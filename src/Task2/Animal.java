package Task2;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    //abstract method getType() that returns type of an Animal
    abstract public String getType();

    //method getName() that returns the name of the animal
    public String getName() {
        return name;
    }



}
