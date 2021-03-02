package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));

        arrayOfColors(colors);

        System.out.println("Sort a given array list in both directions");
        System.out.println("Sort Ascending");
        Collections.sort(colors);
        printList(colors);

        System.out.println("Sort Descending");
        Collections.reverse(colors);
        printList(colors);

        System.out.println("Copy current array list into another new.");
        List<String> colors1 = new ArrayList<>(colors);
        printList(colors1);

        System.out.println("Join this two array lists");
        colors.addAll(colors.size(), colors1);
        printList(colors);

        System.out.println("Shuffle elements in the output array list.");
        Collections.shuffle(colors);
        printList(colors);

        List<String> colors2 = new ArrayList<>(Arrays.asList("red", "pink", "pink", "red", "green", "green", "red", "black"));
        System.out.println(compareArraylists(colors, colors2));

    }

    private static void arrayOfColors(List<String> colors) {

        System.out.println("Iterate through all elements in a array list and print out the collection");
        printList(colors);

        System.out.println("Insert an element into the array list at the first position.");
        colors.add(0, "black");
        printList(colors);

        System.out.println("Retrieve an element (at a specified index) from a given array list.");
        System.out.println(colors.get(2));
        System.out.println();

        System.out.println("Update specific element by any other new element.");
        colors.set(3, "pink");
        printList(colors);

        System.out.println("Search an element in a array list by value.");
        for (String color : colors) {
            if (color.contains("pink")) {
                System.out.println(color);
            }
        }

        System.out.println();
    }

    private static void printList(List<String> colors) {
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();
    }

    private static <T> boolean compareArraylists(List<T> list1, List<T> list2) {
        return list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1);
    }

}
