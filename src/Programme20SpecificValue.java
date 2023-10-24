import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme20SpecificValue {
    public static void main(String[] args) {
        String[] fruit = {"banana", "grapes", "apple", "pears", "plumbs", "orange", "strawberry", "guava"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Fruit name: ");
        String targetvalue = scanner.nextLine();
        boolean result = specificValue(fruit, targetvalue);
        if (result) {
            System.out.println("The Array contains the value " + targetvalue);
        } else {
            System.out.println("The Array does not contains the value " + targetvalue);
        }
        scanner.close();

    }

    public static boolean specificValue(String[] array, String targetvalue) {
        return Arrays.asList(array).contains(targetvalue);
    }
}
