package collection.list;

import java.util.LinkedList;

public class LnkLst {
    public static void main(String a[]) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("A");
        name.add("G");
        name.addLast("B");
        name.addFirst("C");

        System.out.println("Name: " + name);

        name.add(1, "D");

        name.get(2);
        System.out.println("Name: " + name);

        name.remove(2);
        System.out.println("Name: " + name);

        name.set(2, "F");
        System.out.println("Name: " + name);

        int total_size = name.size();
        System.out.println("Total Size: " + total_size);

        name.removeFirst();
        name.removeLast();
        System.out.println("Name: " + name);
    }
}
