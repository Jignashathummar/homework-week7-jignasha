import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter one symbol from (+, -, /, *) : ");
        char symbol = scanner.next().charAt(0);
        String result = calculator(num1, num2, symbol);
        System.out.println(result);
        scanner.close();

    }

    /**
     * method for define number values and symbol
     *
     * @param num1
     * @param num2
     * @param symbol
     * @return
     */
    public static String calculator(int num1, int num2, char symbol) {
        if (symbol == '+') {
            return "Addition of " + num1 + " and " + num2 + " is equal to " + (num1 + num2);
        } else if (symbol == '-') {
            return "Subtraction of " + num1 + " and " + num2 + " is equal to " + (num1 - num2);
        } else if (symbol == '/') {
            return "Division of " + num1 + " and " + num2 + " is equal to " + (num1 / num2);
        } else if (symbol == '*') {
            return "Multiplication of " + num1 + " and " + num2 + " is equal to " + (num1 * num2);
        } else {
            return "Invalid Symbol";
        }
    }
}
