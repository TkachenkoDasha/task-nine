package task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayListOfStrings = new ArrayList<>();
        arrayListOfStrings.add("fgdjsld");
        arrayListOfStrings.add("dfg");
        arrayListOfStrings.add("hfhf");
        arrayListOfStrings.add("diopl");
        arrayListOfStrings.add("pops");

        List<String> linkedListOfStrings = new LinkedList<>(arrayListOfStrings);

        System.out.println("ArrayList of Strings with even length");
        printList(arrayListOfStrings);

        removeEvenLength(arrayListOfStrings);

        System.out.println("After removing even length");
        printList(arrayListOfStrings);

        System.out.println("LinkedList of Strings with even length");
        printList(linkedListOfStrings);

        removeEvenLength(linkedListOfStrings);

        System.out.println("After removing even length");
        for (String lines : linkedListOfStrings) {
            System.out.println(lines);
        }
    }

    private static void printList(List<String> arrayListOfStrings) {
        for (String lines : arrayListOfStrings) {
            System.out.println(lines);
        }
        System.out.println();
    }

    private static void removeEvenLength(List<String> lineOfStrings) {
            for (int i = 0; i < lineOfStrings.size(); i++) {
                if (lineOfStrings.get(i).length() % 2 == 0) {
                    lineOfStrings.remove(i);
                }
            }
    }
}
