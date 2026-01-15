package basic;

import java.util.Arrays;
import java.util.List;

public class WrapperClassDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        String s = "12";
        int num = Integer.parseInt(s);
        int result = num + 2; // 14
        System.out.println(result);

        List<Integer> myList = Arrays.asList(1, 3, 4);
        System.out.println(myList);

        int x = 123456;
        String strNum = Integer.toString(x);
        String sub = strNum.substring(0, 3);
        System.out.println(sub);
    }
}
