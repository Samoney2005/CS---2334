package scook4; 

import java.util.*;

public class queue {  
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(45);
        numbers.add(78);
        numbers.add(25);
        numbers.add(19);

        System.out.println("Initial HashSet: " + numbers);

        // Create a LinkedHashSet
        LinkedHashSet<Integer> numbers2 = new LinkedHashSet<>(5);
        numbers2.add(34);
        numbers2.add(89);
        numbers2.add(41);
        System.out.println("Initial LinkedHashSet: " + numbers2);

        // Create a TreeSet
        TreeSet<Integer> numbers3 = new TreeSet<>();
        numbers3.add(5);
        numbers3.add(2);
        numbers3.add(8);
        numbers3.add(4);
        numbers3.add(7);
        System.out.println("TreeSet: " + numbers3);
    }
}

