package scook4;
import java.util.*;

public class javamapexamples {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 45);
        map.put("Jenny", 32);
        map.put("Kevin", 35);

        System.out.println("HashMap: " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

        // LinkedHashMap
        LinkedHashMap<Integer, String> linkedmap = new LinkedHashMap<>(); // Fixed incorrect type parameters
        linkedmap.put(3, "red");
        linkedmap.put(5, "yellow");
        linkedmap.put(2, "blue");
        linkedmap.put(1, "green");

        System.out.println("LinkedHashMap: " + linkedmap);

        for (Map.Entry<Integer, String> entry : linkedmap.entrySet()) { // Fixed incorrect type parameters
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

        for (Integer key : linkedmap.keySet()) { 
            System.out.println(key);
        }
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "red");
        treeMap.put(5,  "yellow");
        treeMap.put(2, "blue");
        treeMap.put(1,  "green");
        System.out.println("TreeMap: "+treeMap);
        
    }
}


	

