package oop;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square...");
    }

    @Override
    public void printInfo() {
        System.out.println("Info from Square");
    }
}
