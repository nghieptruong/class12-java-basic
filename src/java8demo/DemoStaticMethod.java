package java8demo;

public class DemoStaticMethod {

    public static void main(String[] args) {
//        DemoStaticMethod demo = new DemoStaticMethod(); // ko co ham constructor, java tu add constructor ko tham so
//        int result = demo.add(1, 2);
//        System.out.println(result);
//
//        int result2 = DemoStaticMethod.multiply(2, 2);
//        System.out.println(result2);

        //call voi lambda expression
        StaticFunctionalInterface funcInterface = (int x, int y) -> x * y;
        int result3 = funcInterface.multiply(2, 2);
        System.out.println(result3);

        //call voi reference method
        StaticFunctionalInterface refInterface = DemoStaticMethod::multiply;
        int result4 = refInterface.multiply(2, 2);
        System.out.println(result4);
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

