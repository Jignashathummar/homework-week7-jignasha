import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = scanner.nextLine();
        identify(input);
        scanner.close();
    }

    //method for identify number or symbol
    public static void identify(String input) {
        if (input.length() == 1) {
            char ch = input.charAt(0);
            if (Character.isDigit(ch)) {
                System.out.println("Input value is a number.");
            } else if (Character.isLetter(ch)) {
                System.out.println("Input value is a alphabet.");
            } else {
                System.out.println("Input value is a Symbol.");
            }
        } else {
            System.out.println("Please enter a single character.");
        }
    }
}
