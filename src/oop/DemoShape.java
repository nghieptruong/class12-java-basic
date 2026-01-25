package oop;

import java.util.ArrayList;
import java.util.List;

public class DemoShape {
    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
        square.printInfo(); // Info from Square

        Circle circle = new Circle();
        circle.draw();
        circle.printInfo(); // Info from Circle

        System.out.println("-----------------------");
        //Bo het tat ca cai circle, square vao 1 cai danh sach
        List<Shape> savedList = new ArrayList<>();
        saveShape(savedList, square);
        saveShape(savedList, circle);
        for (int i = 0; i < savedList.size(); i++) {
            Shape shape = savedList.get(i);
            shape.draw();
        }

        System.out.println("--------------");
    }
    public static void saveShape(List<Shape> list, Shape object) {
        list.add(object);
    }
}
