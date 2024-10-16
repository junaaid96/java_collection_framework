package collection.set;

import java.util.HashSet;

public class HshSt {
    public static void main(String a[]) {
        HashSet<String> name = new HashSet<String>();
        name.add("A");
        name.add("B");
        name.add("C");
        name.add("D");

        System.out.println("Name: " + name);

        name.remove("C");

        System.out.println("Name: " + name);

        if (name.contains("B")) {
            System.out.println("B is in the list!");
        } else {
            System.out.println("B is not in the list!");
        }

        System.out.println("Is the set empty? " + name.isEmpty());

        System.out.println("Size of the set: " + name.size());

        name.clear();
        System.out.println("Name: " + name);
    }

}
