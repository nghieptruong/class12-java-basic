package basic;

import java.util.Random;

public class ForDemo {
    public static void main(String[] args) {
        // vong lap for
//        for(int i = 15; i <= 20; i++) {
//            System.out.println("Hello");
//        }
//
//        System.out.println("------------------");
//        for(int i = 15; i < 20; i++) {
//            System.out.println("Hello");
//        }

//        int i = 15;
//        while(i <= 20) {
//            System.out.println("Hello");
//            i++;
//        }

        Random random = new Random();
//        int randomValue = random.nextInt();
//        System.out.println(randomValue);

//        while(random.nextInt() > 0) {
//            System.out.println("Hello");
//        }

//        int i = 15;
//        do {
//            System.out.println("Hello");
//            i++;
//        } while(i <= 20);


//        do {
//            System.out.println("Hello");
//        } while(random.nextInt() > 0);


//        int rand;
//        while(true) {
//            System.out.println("Hello");
//            rand = random.nextInt();
//            System.out.println(rand);
//            if(rand < 0) {
//                break;
//            }
//        }

//        for(int i = 15; i <= 20; i++) {
//            if(i == 18) {
//                continue;
//            }
//            System.out.println(i + " - Hello");
//        }

//        int sum2Numbers = sum(1, 2);
//        System.out.println(sum2Numbers);

        for (int i = 0; i < 5; i++) {
            if(i == 3)
                return;
            System.out.println(i);
        }
        System.out.println("See you again!");
    }
    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }
}
