package collection.queue;

import java.util.ArrayDeque;

public class ArrDeq {
    public static void main(String a[]) {
        ArrayDeque<String> name = new ArrayDeque<String>();
        name.offer("John");
        name.offer("Doe");
        name.offer("Smith");
        name.offer("Alex");

        System.out.println("Name: " + name);

        name.offerFirst("Mr.");
        name.offerLast("Jr.");

        System.out.println("Name: " + name);

        System.out.println("First: " + name.peekFirst());
        System.out.println("Last: " + name.peekLast());
        name.pollFirst();
        name.pollLast();
        System.out.println("Name: " + name);

    }
}
