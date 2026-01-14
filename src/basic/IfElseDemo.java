package basic;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
//        int x = 3;
//        if(x % 2 == 0) {
//            System.out.println("x la so chan");
//        } else {
//            System.out.println("x la so le");
//        }

//        int age = 18;
//        if (age > 18) {
//            System.out.println("Age > 18");
//        } else if(age == 18) {
//            System.out.println("Age == 18");
//        } else {
//            System.out.println("Age < 18");
//        }

        /*
            Yeu Cau: Neu user nhap browser la Chrome thi se in ra "run with Chrome"
                    - nhap Firefox thi se in ra "run with Firefox"
                    - nhap Safari thi se in ra "run with Safari"
                    - nguoc lai thi se in ra "not support!"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser: ");
        String browser = sc.nextLine();
//        if(browser.equals("Chrome")) {
//            System.out.println("run with Chrome");
//        } else if(browser.equals("Firefox")) {
//            System.out.println("run with Firefox");
//        } else if(browser.equals("Safari")) {
//            System.out.println("run with Safari");
//        } else {
//            System.out.println("not support!");
//        }

        /*
            Yeu cau: neu browser la Chrome, Firefox, Edge --> run on Windows platform OS
                     nguoc lai neu browser la Safari    --> run on Mac platform
                     nguoc lai     --> not support!
         */
        switch (browser) {
            case "Chrome":
            case "Firefox":
            case "Edge":
                System.out.println("run on Windows platform OS");
                break;
            case "Safari":
                System.out.println("run on Mac platform");
                break;
            default:
                System.out.println("not support!");
        }


    }
}
