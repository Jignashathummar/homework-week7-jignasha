import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet from 'A' to 'F': ");
        char input = scanner.next().toUpperCase().charAt(0);
        String cityName = alphabet(input);
        System.out.println(input + " city name is " + cityName);
        scanner.close();
    }

    /**
     * Input alphabet from 'A' to 'F' and find cityName using if else condition
     *
     * @param input
     * @return
     */
    public static String alphabet(char input) {
        String cityName;
        if (input == 'A') {
            cityName = "Auckland";
        } else if (input == 'B') {
            cityName = "Birmingham";
        } else if (input == 'C') {
            cityName = "Chicago";
        } else if (input == 'D') {
            cityName = "Doncaster";
        } else if (input == 'E') {
            cityName = "Edinburgh";
        } else if (input == 'F') {
            cityName = "Faisalabad";
        } else {
            cityName = "Invalid entry";
        }
        return cityName;
    }
}
