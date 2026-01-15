package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("John");
        myList.add("Alice");
        myList.add("Tom");
        System.out.println(myList.size());
        myList.add("Thomas");
        System.out.println(myList.size());
        myList.remove("Thomas");
        System.out.println(myList.size());

        System.out.println(myList); // in dc nho ham toString()

        String[] strArr = {"John", "Alice", "Tom"};
        System.out.println(strArr);

        List<String> myList2 = Arrays.asList("John", "Alice", "Tom");
        System.out.println(myList2);

        Iterator<String> iterator = myList2.iterator();
        while(iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        /*
                myList = "John", "Alice", "Tom", "Tom", "Tom", "Alice", "John"
                John = 2
                Alice = 2
                Tom = 3
                Yeu cau:
                    1. Ko xai hashmap
                    2. Xai array 2 chieu
                    3. Xai list
         */

    }
}
