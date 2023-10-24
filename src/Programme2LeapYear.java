import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme2LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        String result = leapYear(year);
        System.out.println(year + " " + result);
        sc.close();
    }

    /**
     * @param year
     * @return - Leap year
     */
    public static String leapYear(int year) {
        String result;
        if (year % 4 == 0) {
            result = "is a Leap Year";
        } else {
            result = "is Not a Leap Year";
        }
        return result;
    }
}
