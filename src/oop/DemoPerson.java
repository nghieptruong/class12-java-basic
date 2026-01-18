package oop;

public class DemoPerson {
    public static void main(String[] args) {
        //Khai bao 1 bien doi tuong co kieu Person va khoi tao doi tuong (dung tu khoa new)
        Person p = new Person("John", 24, "123 Street A");
        System.out.println(p.getName()); // John
        System.out.println(p.getAge()); // 24
        System.out.println(p.getAddress()); // 123 Street A
        System.out.println(p.hashCode());

        System.out.println("----------------");
        Person p2 = new Person("Alice", 28, "345 Street B");
        System.out.println(p2.getName()); // Alice
        System.out.println(p2.getAge()); // 28
        System.out.println(p2.getAddress()); // 345 Street B
        System.out.println(p2.hashCode());

        System.out.println("----------------");
        Student s1 = new Student("Tommy", 22, "100 Street C");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getAddress());

        System.out.println("-------------------");
        Teacher t1 = new Teacher("David", 46, "200 Street D");
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getAddress());

        //Đa hình
        System.out.println("--------------");
        Person p3 = s1;
        System.out.println(p3.getName()); // Tommy
        p3 = t1;
        System.out.println(p3.getName()); // David
    }
}
