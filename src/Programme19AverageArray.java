import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19AverageArray {
    public static void main(String[] args) {
        double[] num = {2, 5, 67, 34, 65};
        double avgOfArray = averageOfArray(num);
        System.out.println("Average of Array " + Arrays.toString(num) + " is equal to " + avgOfArray);
        System.out.println("Average of Array " + Arrays.toString(num) + " is equal to using stream " + Arrays.stream(num).average().orElse(0.0));
    }

    public static double averageOfArray(double[] num) {
        int length = num.length;
        double sum = 0;
        for (double value : num) {
            sum += value;
        }
        return sum / length;
    }
}
