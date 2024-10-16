package map;

import java.util.TreeMap;

public class TreeMp {
    public static void main(String a[]) {
        TreeMap<String, Integer> employees = new TreeMap<>();
        TreeMap<String, Integer> employees2 = new TreeMap<>();

        employees.put("junaid", 101);
        employees.put("ahmed", 340);
        employees.put("riad", 202);
        employees.put("abid", 174);
        employees.put("hasan", 103);

        employees2.putAll(employees);

        System.out.println(employees2.firstKey());
        System.out.println(employees2.lastKey());
        System.out.println(employees2.lowerKey("riad"));
        System.out.println(employees2.higherKey("hasan"));

        System.out.println(employees2.ceilingKey("ria")); // Returns the least key greater than or equal to the given
                                                          // key, or null if there is no such key.
        System.out.println(employees2.floorKey("aha")); // Returns the greatest key less than or equal to the given key,
                                                        // or null if there is no such key.

        System.out.println(employees2.firstEntry());
        System.out.println(employees2.lastEntry());
    }
}
