import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry using switch statement
 */
public class Programme9SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet from 'A' to 'F': ");
        char input = scanner.next().toUpperCase().charAt(0);
        String cityName = getCityName(input);
        System.out.println("Alphabet " + input + " According city name is " + cityName);
        scanner.close();
    }

    /**
     * Input alphabet from 'A' to 'F' and find cityName using switch statement
     *
     * @param input
     * @return
     */

    public static String getCityName(char input) {
        String cityName;
        switch (input) {
            case 'A':
                cityName = "Auckland";
                break;
            case 'B':
                cityName = "Birmingham";
                break;
            case 'C':
                cityName = "Chicago";
                break;
            case 'D':
                cityName = "Doncaster";
                break;
            case 'E':
                cityName = "Edinburgh";
                break;
            case 'F':
                cityName = "Faisalabad";
                break;
            default:
                cityName = "Invalid entry";
                break;
        }
        return cityName;

    }
}
