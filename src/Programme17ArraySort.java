import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme17ArraySort {
    public static void main(String[] args) {
        int[] numeric = {3, 2, 6, 1, 5, 9, 8, 7};
        System.out.println("Numeric Array:" + Arrays.toString(numeric));
        Arrays.sort(numeric);
        System.out.println("sort numeric array:" + Arrays.toString(numeric));

        String[] fruit = {"banana", "grapes", "apple", "pears", "plumbs", "orange", "strawberry", "guava"};
        System.out.println("String Array: " + Arrays.toString(fruit));
        Arrays.sort(fruit);
        System.out.println("sort string array: " + Arrays.toString(fruit));

    }
}
