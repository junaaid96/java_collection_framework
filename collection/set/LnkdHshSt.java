package collection.set;

import java.util.LinkedHashSet;

public class LnkdHshSt {
    public static void main(String a[]) {
        // LinkedHashSet maintains the insertion order, subclass of HashSet and slower
        // than HashSet.

        LinkedHashSet<String> name = new LinkedHashSet<String>();
        name.add("B");
        name.add("A");
        name.add("D");
        name.add("C");

        System.out.println("Name: " + name);

        name.remove("C");

        System.out.println("Name: " + name);

        if (name.contains("B")) {
            System.out.println("B is in the list!");
        } else {
            System.out.println("B is not in the list!");
        }

        System.out.println("Is the set empty? " + name.isEmpty());

    }
}
