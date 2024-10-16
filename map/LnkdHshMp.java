package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LnkdHshMp {
    public static void main(String a[]) {
        LinkedHashMap<String, Integer> employees = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> employees2 = new LinkedHashMap<>();

        employees.put("junaid", 101);
        employees.put("ahmed", 340);
        employees.put("riad", 202);
        employees.put("abid", 174);
        employees.put("hasan", 103);

        employees2.putAll(employees);

        System.out.println(employees.computeIfAbsent("akib", key -> key.length()));
        System.out.println(employees.computeIfPresent("riad", (key, value) -> value));

        employees2.replace("riad", 202, 201);

        // entrySet() - Get all entries (in access order)
        for (Map.Entry<String, Integer> entry : employees2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // removeEldestEntry() - Override to implement a custom removal if size is
        // exceed.
        LinkedHashMap<String, Integer> customLinkedMap = new LinkedHashMap<String, Integer>(3, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > 3;
            }
        };

        customLinkedMap.put("A", 1);
        customLinkedMap.put("B", 2);
        customLinkedMap.put("C", 3);
        customLinkedMap.put("D", 4); // This will cause "A" to be removed

        System.out.println("Custom LinkedHashMap: " + customLinkedMap);

    }
}
