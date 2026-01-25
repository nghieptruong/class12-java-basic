package oop;

public class DemoInterface {
    public static void main(String[] args) {
        Bird b = new Bird("Bird A");
        b.fly();
        System.out.println(b.getName());
        IFlyable b2 = new Bird("Bird B");
        b2.fly();

        Bird b3 = new Bird("Bird E", "Asia");

        Butterfly bf = new Butterfly("Butterfly C");
        bf.fly();
        System.out.println(bf.getName());
        IFlyable bf2 = new Butterfly("Butterfly D");
        bf2.fly();
    }
}
