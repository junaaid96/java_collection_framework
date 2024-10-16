package collection.list;

import java.util.Stack;

public class Stck {
    public static void main(String a[]) {
        Stack<String> name = new Stack<String>();
        name.push("A");
        name.push("B");
        name.push("C");
        name.push("D");

        System.out.println("Name: " + name);

        name.pop(); // pop() removes the top of the stack

        System.out.println("Name: " + name);

        System.out.println(name.peek());

        if (name.empty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack is not empty!");
        }

        System.out.println("Search: " + name.search("B"));

    }
}
