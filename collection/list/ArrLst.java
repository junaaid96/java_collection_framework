package collection.list;

import java.util.ArrayList;

public class ArrLst {
    public static void main(String a[]) {
        ArrayList<String> name = new ArrayList<String>();
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

        name.clear();
        System.out.println("Name: " + name);
    }

}