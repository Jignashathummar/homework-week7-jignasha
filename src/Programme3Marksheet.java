import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

//name,roll_no,math_marks,sci_marks,eng_marks,
// total,percentage,result,grade
public class Programme3Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = validateName(sc);

        int rollNo = validaterollno(sc);

        int mathMarks = validMarks(sc, "Maths");
        int sciMarks = validMarks(sc, "Science");
        int engMarks = validMarks(sc, "English");

        double percentage = getPercentage(mathMarks, sciMarks, engMarks);

        String grade = getGrade(percentage);

        String result = (mathMarks >= 35 && sciMarks >= 35 && engMarks >= 35) ? "Pass" : "Fail";

        System.out.println(" _________________________________");
        System.out.println("|                                 |");
        System.out.println("|            Mark Sheet           |");
        System.out.println("|                                 |");
        System.out.println("|_________________________________|");
        System.out.println("|     Name     :     " + name + "       |");
        System.out.println("|     Roll NO  :     " + rollNo + "         |");
        System.out.println("|                                 |");
        System.out.println("|_________________________________|");
        System.out.println("|     Subjects:      Marks:       |");
        System.out.println("|     Math    :      " + mathMarks + "           |");
        System.out.println("|     Science :      " + sciMarks + "           |");
        System.out.println("|     English :      " + engMarks + "           |");
        System.out.println("|_________________________________|");
        System.out.println("|     Total   :      300          |");
        System.out.println("|                                 |");
        System.out.println("|_________________________________|");
        System.out.println("|     Percentage:    " + percentage + "         |");
        System.out.println("|     Result    :    " + result + "         |");
        System.out.println("|     Grade     :    " + grade + "           |");
        System.out.println("|                                 |");
        System.out.println("|_________________________________|");
        sc.close();
    }

    /**
     * method for validate name
     *
     * @param scanner
     * @return name
     */
    public static String validateName(Scanner scanner) {
        System.out.print("Enter your name: ");
        String n = scanner.nextLine();
        if (n == null || n.trim().isEmpty()) {
            System.out.print("Name should not be empty");
            return validateName(scanner);
        }
        return n;
    }

    /**
     * method for validation of Roll number
     *
     * @param scanner
     * @return
     */

    public static int validaterollno(Scanner scanner) {
        System.out.print("Enter your Roll No: ");
        if (scanner.hasNextInt()) {
            int rollno = scanner.nextInt();
            if (rollno != 0) {
                return rollno;
            }
        }
        System.out.println("Invalid Input: Enter Roll Number");
        scanner.nextLine();
        return validaterollno(scanner);
    }

    /**
     * method for valid marks input between 0 to 100
     *
     * @param scanner
     * @param subject
     * @return
     */
    public static int validMarks(Scanner scanner, String subject) {
        System.out.println("Enter your " + subject + " Marks out of 100: ");
        int marks = scanner.nextInt();
        if (marks >= 100 || marks < 0) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return validMarks(scanner, subject);
        }
        return marks;
    }

    /**
     * method for get percentage of Marks
     *
     * @param mathsMarks
     * @param sceinceMarks
     * @param englishMarks
     * @return
     */
    public static double getPercentage(int mathsMarks, int sceinceMarks, int englishMarks) {
        int obtainMarks = mathsMarks + sceinceMarks + englishMarks;
        DecimalFormat df2 = new DecimalFormat("###.##");
        return Double.parseDouble(df2.format((obtainMarks * 100) / 300));
    }

    /**
     * Method for Grade
     *
     * @param percentage
     * @return
     */
    public static String getGrade(double percentage) {
        String grade;
        if (percentage >= 35 && percentage < 50) {
            grade = "C";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
        } else if (percentage >= 80 && percentage <= 100) {
            grade = "A+";
        } else {
            grade = "F";
        }
        return grade;
    }
}
