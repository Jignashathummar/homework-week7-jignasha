import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        String result = numberVerfication(num);
        System.out.println(result);
        scanner.close();
    }

    /**
     * method for number verification
     *
     * @param num
     * @return
     */
    public static String numberVerfication(int num) {
        if (num < 0) {
            return "Enter number is NEGATIVE.";
        } else if (num > 0) {
            return "Enter number is POSITIVE.";
        } else if (num == 0) {
            return "Enter number is ZERO.";
        } else {
            return "Invalid input.";
        }
    }
}
