import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18Sum {
    public static void main(String[] args) {
        int[] num = {12, 42, 24, 45, 2, 4, 6, 10};
        int resultUsingStream = arraySumUsingStream(num);
        System.out.println("Sum of Array " + Arrays.toString(num) + " using stream: " + resultUsingStream);

        int resultWithoutStream = arraySumWithoutStream(num);
        System.out.println("Sum of Array " + Arrays.toString(num) + " without using stream: " + resultWithoutStream);
    }

    /**
     * sum of array
     * @param num
     * @return
     */
    public static int arraySumUsingStream(int[] num) {
        return Arrays.stream(num).sum();
    }

    /**
     * sum of array
     * @param num
     * @return
     */
    public static int arraySumWithoutStream(int[] num) {
        int sum = 0;
        for (int value : num) {
            sum += value;
        }
        return sum;
    }
}
