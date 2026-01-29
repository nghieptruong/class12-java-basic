package oop;

import java.util.ArrayList;
import java.util.List;

public class DemoFinal {
    public static void main(String[] args) {
        final int x = 1; // khai báo final thì giá trị ko dc phép thay đoi
//        x = 2; //báo lỗi: cannot assign
//        x = 3; // báo lỗi: cannot assign
        System.out.println(x);

        final List<Person> listPerson = new ArrayList<>();
        Person p1 = new Person("John", 50, "135 StreetA");
        Person p2 = new Person("Tom", 40, "345 StreetB");
        listPerson.add(p1);
        listPerson.add(p2);

        p1.setName("Alice");
        p2.setName("Thomas");

        System.out.println(listPerson);

        System.out.println("-----------------");
        String nameOfP1 = p1.getName();
        System.out.println(nameOfP1);

        p1.setName("Jame");;

    }
}
