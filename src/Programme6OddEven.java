import java.util.Scanner;

/*
Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is Odd number.");
        }
    }
}
