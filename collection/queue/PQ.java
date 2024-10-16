package collection.queue;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String a[]) {
        PriorityQueue<String> name = new PriorityQueue<String>();

        name.offer("Babul");
        name.offer("Abul");
        name.offer("Dabul");
        name.offer("Cabul");

        System.out.println("Name: " + name);

        System.out.println("Peek: " + name.peek());

        System.out.println("Poll: " + name.poll()); // poll() removes the head of the queue

        System.out.println("Name: " + name);

        if (name.contains("Abul")) {
            System.out.println("Abul is in the list!");
        } else {
            System.out.println("Abul is not in the list!");
        }

    }
}
