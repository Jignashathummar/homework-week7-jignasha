import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7FindSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sales ID: ");
        int id = scanner.nextInt();

        System.out.println("Enter seller's name: ");
        String name = scanner.next();

        System.out.println("Enter sales amount: ");
        int salesAmount = scanner.nextInt();

        System.out.println("Enter basic salary: ");
        double salary = scanner.nextDouble();

        double calSalesCommission = calCommision(salesAmount);
        System.out.println("Sales Amount is " + salesAmount + " then sales commission is: " + calSalesCommission);
        scanner.close();
    }

    /**
     * Method for calculation commission
     *
     * @param salesamount
     * @return
     */

    public static double calCommision(int salesamount) {
        double commissionRate;
        if (salesamount >= 50000) {
            commissionRate = salesamount * 0.35;
        } else if (salesamount >= 30000) {
            commissionRate = salesamount * 0.20;
        } else if (salesamount >= 20000) {
            commissionRate = salesamount * 0.10;
        } else if (salesamount >= 10000) {
            commissionRate = salesamount * 0.05;
        } else {
            commissionRate = salesamount * 0.02;
        }
        return commissionRate;
    }
}
