package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Set loại bỏ phần tử trùng
        HashSet<String> mySet = new HashSet<>();
        mySet.add("John");
        mySet.add("Alice");
        mySet.add("Alice");
        mySet.add("Tom");
        mySet.add("Tom");
        mySet.add("Tom");
        mySet.add("John");
        System.out.println(mySet);

        System.out.println("-------------------------");
        //Duyet set
        for(String item : mySet) {
            System.out.println(item);
        }

        System.out.println("-------------------------");
        Iterator<String> iterator = mySet.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Remove item
        mySet.remove("Tom");
        System.out.println(mySet);

        System.out.println("---------------------");
        HashSet<String> hs = new HashSet<>();
        hs.add("B");
        hs.add("A");
        hs.add("Z");
        hs.add("D");
        System.out.println(hs);

        System.out.println("------------------------");
        LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add("B");
        myLinkedHashSet.add("A");
        myLinkedHashSet.add("Z");
        myLinkedHashSet.add("D");
        System.out.println(myLinkedHashSet);

        System.out.println("------------------------");
        TreeSet<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("B");
        myTreeSet.add("A");
        myTreeSet.add("Z");
        myTreeSet.add("D");
        System.out.println(myTreeSet);

        System.out.println("------------------------");
        TreeSet<String> myTreeSet2 = new TreeSet<>();
        myTreeSet2.add("Brain");
        myTreeSet2.add("Alice");
        myTreeSet2.add("Zidan");
        myTreeSet2.add("David");
        myTreeSet2.add("Anna");
        System.out.println(myTreeSet2);



    }
}
