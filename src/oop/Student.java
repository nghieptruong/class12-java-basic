package oop;

public class Student extends Person {

    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    public void registerClass(String className) {
        System.out.println("Registered " + className);
    }

}
