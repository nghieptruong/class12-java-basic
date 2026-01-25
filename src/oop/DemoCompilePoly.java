package oop;

public class DemoCompilePoly {
    public static void main(String[] args) {
        int result1 = add(1, 2);
        System.out.println("result1 = " + result1);
        int result2 = add(1, 2, 3);
        System.out.println("result2 = " + result2);
        double result3 = add(1.5, 2);
        System.out.println("result3 = " + result3);
        int result4 = (int) result3;
        System.out.println("result4 = " + result4);

    }

    //Ham 2 tham so kieu int
    public static int add(int a, int b) {
        return a + b;
    }

    //Hame 3 tham so
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    //Ham 2 tham so kieu double
    public static double add(double a, double b) {
        return a + b;
    }
}
