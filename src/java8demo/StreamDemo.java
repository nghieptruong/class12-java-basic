package java8demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        //1. for i / for each (for(Integer item : listNumbers)
//
//        List<Integer> evenList = new ArrayList<>();
//        for (int i = 0; i < listNumbers.size(); i++) {
//            int item = listNumbers.get(i); // lay tung phan tu item theo index
//            if(item % 2 == 0) {
//                //quăng dô cái list mới
//                evenList.add(item);
//
//                //in ra
////                System.out.println(item);
//            }
//        }
//        //in cai list moi
//        System.out.println(evenList);

        //2. Java8 Stream
        Predicate<Integer> predicate = (number) -> number % 2 == 0;
        Consumer<Integer> consumer = (number) -> System.out.println(number);
//        listNumbers.stream().filter(predicate).forEach(consumer);
        List<Integer> newEvenList = listNumbers.stream().filter(predicate).toList();
        System.out.println(newEvenList);
    }
}
