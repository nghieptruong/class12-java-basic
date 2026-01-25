package oop;

public class Bird extends Animal implements IFlyable {

    private String area;

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, String area) {
//        this.name = name; // thay vi goi nhu nay --> duplicate code, co the thay the bang this(name)-> goi constructor public Bird(String name)
        this(name);
        this.area = area;
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }
}
