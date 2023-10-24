import java.util.Scanner;

/**
 *1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Programme1OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        String result = oddEven(a);
        System.out.println(a + " is " + result + " number");
        sc.close();
    }

    /**
     *
     * @param num
     * @return - String Odd or Even value
     * Verify Even or Odd number using Ternary Operator
     */
    public static String oddEven(int num) {
        String result = (num % 2 == 0) ? "even" : "odd";
        return result;
    }
}
