package oop;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    public void printInfo() {
        System.out.println("Info from Circle");
    }
}
