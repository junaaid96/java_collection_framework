package list;

import java.util.Vector;

public class Vect {
    public static void main(String a[]) {
        Vector<String> name = new Vector<String>();
        name.add("A");
        name.add("B");
        name.add("C");

        System.out.println("Name: " + name);

        name.add(1, "D");
        name.add(2, "E");

        System.out.println("Name: " + name);

        name.get(2);
        System.out.println("Name: " + name);

        name.remove(2);
        System.out.println("Name: " + name);

        name.set(2, "F");
        System.out.println("Name: " + name);

        int total_size = name.size();
        System.out.println("Total Size: " + total_size);
    }
}
