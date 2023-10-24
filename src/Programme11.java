public class Programme11 {
    /**
     * Write a java program to print the numbers between 1 to 100 which can be divided by 3
     * and 5 separately.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Number divided by 3: ");
        separateDivideBy3();
        System.out.println("\nNumber divided by 5: ");
        separateDivideBy5();
    }

    //method for print the number between 1 to 100 which is divided by 3
    public static void separateDivideBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    //method for print the number between 1 to 100 which is divided by 5
    public static void separateDivideBy5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
