package map;

import java.util.Hashtable;
import java.util.Map;

public class HshTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        // put() - Add key-value pairs
        table.put("One", 1);
        table.put("Two", 2);
        table.put("Three", 3);

        System.out.println("Value of Two: " + table.get("Two"));

        System.out.println("Contains 'Four'? " + table.containsKey("Four"));

        System.out.println("Contains value 3? " + table.containsValue(3));

        table.putIfAbsent("Four", 4);

        table.remove("Two");

        System.out.println("Keys: " + table.keySet());

        System.out.println("Values: " + table.values());

        // entrySet() - Get all entries
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}