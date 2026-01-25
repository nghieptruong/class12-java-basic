package oop;

public class Butterfly extends Animal implements IFlyable {

    public Butterfly(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Butterfly is flying...");
    }
}
