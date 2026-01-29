package basic;

import oop.House;

public class FirstScript {
    public static void main(String[] args) {
        // khai bao bien co ten x voi kieu la int (kieu so nguyen)
        //1. Kieu so nguyen (byte, short, int, long)
        byte y = 1;
        short z = 2;
        int x = 2147483647; // trong automation test, xai int
        long k = 3;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //2. Kieu so thuc
        float f = 1.2f;
        double d = 3.5;

        //3. String ko phai kieu du lieu co ban (class), immutable (ko dc chinh sua)
        String s = "Hello"; // khai bao bien s co kieu la chuoi voi gia tri Hello

        //4. boolean : kieu logic true/false
        boolean b = true;
        boolean isDone = false;

    }
}
