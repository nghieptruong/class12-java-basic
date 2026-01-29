package oop;

public class DemoStaticMethod {

    public static void main(String[] args) {
        DemoStaticMethod demo = new DemoStaticMethod(); // ko co ham constructor, java tu add constructor ko tham so
        int result = demo.add(1, 2);
        System.out.println(result);

        int result2 = DemoStaticMethod.multiply(2, 2);
        System.out.println(result2);
    }

    //instance method: muon goi phuong thuc instance nay, phai new đối tượng -> <object_variable>.<ten_method>
    public int add(int a, int b) {
        return a + b;
    }

    //static method: muon goi phuong thuc static nay, chi can dung <ten class>.<ten_method>
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
