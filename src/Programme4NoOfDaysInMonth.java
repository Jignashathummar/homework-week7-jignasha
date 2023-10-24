import java.util.Scanner;

/**
 * 4. Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 * Example of input/Output:
 * ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
 * ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 *  year.
 * ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 *  2018 is not a leap year.
 * ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
 * ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 *  9999
 * HINT: Use the switch statement.
 * NOTE: Methods isLeapYear and getDaysInMonth need to be public static
 */
public class Programme4NoOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year < 1 || year > 9999) {
            isLeapYear = false;
            System.out.println(year + " is not in the range(1-9999)");
        } else {
            switch (year % 4) {
                case 0:
                    if (year % 100 == 0 && year % 400 != 0) {
                        break;
                    }
                    isLeapYear = true;
                default:
                    break;
            }
            if (isLeapYear) {
                System.out.println(year + " is a Leap Year.");
                System.out.println(isLeapYear);
            } else {
                System.out.println(year + " is not a Leap Year.");
                System.out.println(isLeapYear);
            }
        }

        return isLeapYear;

    }

    public static int getDaysInMonth(int month, int year) {
        String monthOfName;
        if (month > 12 || month < 1) {
            System.out.println(month + " month is Invalid.");
            return -1;
        } else {
            int numOfDaysMonth = 0;
            switch (month) {
                case 1:
                    monthOfName = "January";
                    numOfDaysMonth = 31;
                    break;
                case 2:
                    monthOfName = "February";
                    numOfDaysMonth = isLeapYear(year) ? 29 : 28;
//                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//                    numOfDaysMonth = 29;
//                } else {
//                    numOfDaysMonth = 28;
//                }
                    break;
                case 3:
                    monthOfName = "March";
                    numOfDaysMonth = 31;
                    break;
                case 4:
                    monthOfName = "April";
                    numOfDaysMonth = 30;
                    break;
                case 5:
                    monthOfName = "May";
                    numOfDaysMonth = 31;
                    break;
                case 6:
                    monthOfName = "June";
                    numOfDaysMonth = 30;
                    break;
                case 7:
                    monthOfName = "July";
                    numOfDaysMonth = 31;
                    break;
                case 8:
                    monthOfName = "August";
                    numOfDaysMonth = 31;
                    break;
                case 9:
                    monthOfName = "September";
                    numOfDaysMonth = 30;
                    break;
                case 10:
                    monthOfName = "October";
                    numOfDaysMonth = 31;
                    break;
                case 11:
                    monthOfName = "November";
                    numOfDaysMonth = 30;
                    break;
                case 12:
                    monthOfName = "December";
                    numOfDaysMonth = 31;
                    break;
                default:
                    monthOfName = "month is Invalid";
            }
            System.out.println(monthOfName + " has " + numOfDaysMonth + " days.");
            return numOfDaysMonth;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter Month: ");
        int month = scanner.nextInt();
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            getDaysInMonth(month, year);
        }

        scanner.close();
    }
}
