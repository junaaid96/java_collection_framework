package collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSt {
    public static void main(String a[]) {
        // Custom comparator: buggy version
        // Comparator<String> sortByLength = new Comparator<String>() {
        // public int compare(String s1, String s2) {
        // return Integer.compare(s1.length(), s2.length());
        // }
        // };

        // custom comparator: improved version
        Comparator<String> sortByLengthThenAlphabetically = new Comparator<String>() {
            public int compare(String s1, String s2) {
                int lengthComparison = Integer.compare(s1.length(), s2.length());
                if (lengthComparison != 0) {
                    return lengthComparison;
                }
                return s1.compareTo(s2); // If lengths are equal, compare alphabetically
            }
        };

        // Create TreeSet with the custom comparator
        TreeSet<String> namesByLength = new TreeSet<>(sortByLengthThenAlphabetically);

        // Create TreeSet with natural ordering (alphabetical)
        TreeSet<String> namesByAlphabet = new TreeSet<>();

        String[] namesToAdd = { "Abidflames", "Babu", "Cathy", "Daisy", "Tanvir", "Jackkk" };

        for (String name : namesToAdd) {
            namesByLength.add(name);
        }

        System.out.println(namesByLength);

        namesByAlphabet.addAll(namesByLength);

        System.out.println("Names sorted by length: " + namesByLength);
        System.out.println("Names sorted alphabetically: " + namesByAlphabet);

        // Calling iterator() method, it is used to traverse elements of a collection
        Iterator<String> iterator = namesByAlphabet.iterator();

        System.out.print("TreeSet using Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(" ");
        }

        System.out.println();

        // Operations on alphabetically sorted set
        System.out.println("Subset from Babu to Tanvir: " + namesByAlphabet.subSet("Babu", "Tanvir"));
        System.out.println("HeadSet before Cathy: " + namesByAlphabet.headSet("Cathy"));
        System.out.println("TailSet from Cathy: " + namesByAlphabet.tailSet("Cathy"));
        System.out.println("First element: " + namesByAlphabet.first());
        System.out.println("Last element: " + namesByAlphabet.last());
        System.out.println("Lower than Babu: " + namesByAlphabet.lower("Babu"));
        System.out.println("Higher than Babu: " + namesByAlphabet.higher("Babu"));

        System.out.println(namesByAlphabet.descendingSet()); // Returns a reverse order view of the elements
    }
}
