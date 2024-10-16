package map;

import java.util.HashMap;

public class HshMp {
    public static void main(String a[]) {
        HashMap<String, Integer> employees = new HashMap<>();
        HashMap<String, Integer> employees2 = new HashMap<>();

        employees.put("junaid", 101);
        employees.put("ahmed", 340);
        employees.put("riad", 202);
        employees.put("abid", 174);
        employees.put("hasan", 103);

        employees2.putAll(employees);

        System.out.println(employees2);
        System.out.println(employees.get("riad"));
        employees.remove("riad");

        boolean found = employees.containsKey("riad");

        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }

        boolean f = employees.containsValue(103);
        System.out.println(f);

        System.out.println(employees2.size());
        System.out.println(employees2.keySet());
        System.out.println(employees2.values());

        employees2.putIfAbsent("riad", 122);
        System.out.println(employees2);
    }
}
