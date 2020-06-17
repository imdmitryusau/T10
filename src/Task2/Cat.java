package Task2;

public class Cat extends Animal implements Moveable {
    String str = "Cat";

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return str;
    }

    @Override
    public void start() {
        System.out.println("Cat starts!");
    }

    @Override
    public void stop() {
        System.out.println("Cat stopped!");
    }
}
