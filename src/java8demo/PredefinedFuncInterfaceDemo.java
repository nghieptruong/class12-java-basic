package java8demo;

import java.util.function.Predicate;

public class PredefinedFuncInterfaceDemo {
    public static void main(String[] args) {
        // 1. Goi static method binh thuong
        int x = 2;
        boolean result1 = PredefinedFuncInterfaceDemo.isEven(x);
        System.out.println(result1);

        //2. Functional interface (ko can implement 1 cai class ke thua)
        EvenFunctionalInferface evenFuncInterface = (number) -> number % 2 == 0;
        boolean result2 = evenFuncInterface.isEven(2);
        System.out.println(result2);

        //3. Method reference (cung can có functional interface, cu phap goi khac lamba expression, ngan gon hon)
        EvenFunctionalInferface methodFuncInterface = PredefinedFuncInterfaceDemo::isEven;
        boolean result3 = evenFuncInterface.isEven(2);
        System.out.println(result3);

        //4. Predefined functional interface (ko can phai tao ra 1 class functional interface)
        //4.1 khai bao lambda expression
        Predicate<Integer> predicate = (number) -> number % 2 == 0;
        boolean result4 = predicate.test(2);
        System.out.println(result4);

        //4.2 khai bao voi method reference
        Predicate<Integer> predicateMethod = PredefinedFuncInterfaceDemo::isEven;
        boolean result5 = predicateMethod.test(2);
        System.out.println(result5);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
