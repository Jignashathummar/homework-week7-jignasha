import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

public class Programme5Salaryslip {
    static double salary;
    static double hra;
    static double ta;
    static double da;
    static double pf;
    static double grossSalary;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employeeName = validateEmployeeName(scanner);
        int employeeId = validateEmployeeId(scanner);

        double basicSalary = validateEmployeeSalary(scanner);

        double pf = calculatePF(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA(basicSalary);
        double hra = calculateHRA(basicSalary);

        double grossSalary = calculateGrossSalary(hra, da, ta, pf, basicSalary);
        printSalarySlip(employeeId, employeeName, basicSalary, hra, ta, da, pf, grossSalary);

        scanner.close();
    }

    /**
     * Print final salary slip
     *
     * @param employeeId
     * @param employeeName
     * @param basicSalary
     * @param hra
     * @param ta
     * @param da
     * @param pf
     * @param grossSalary
     */
    public static void printSalarySlip(int employeeId, String employeeName, double basicSalary, double hra, double ta, double da, double pf, double grossSalary) {
        System.out.println("__________________________________");
        System.out.println("|            Salary Slip           |");
        System.out.println("|__________________________________|");
        System.out.println("| Employee Id       :      " + employeeId + "    |");
        System.out.println("| Employee Name     :      " + employeeName + "   |");
        System.out.println("|                                  |");
        System.out.println("|__________________________________|");
        System.out.println("| Basic Salary      :      " + basicSalary + " |");
        System.out.println("| HRA 10%           :      " + hra + "  |");
        System.out.println("| TA 8%             :      " + ta + "   |");
        System.out.println("| DA 9%             :      " + da + "   |");
        System.out.println("| PF - 20&          :      " + pf + "   |");
        System.out.println("|                                  |");
        System.out.println("|__________________________________|");
        System.out.println("|Gross Salary       :       " + grossSalary + "    |");
        System.out.println("|__________________________________|");
    }

    /**
     * validation for employee Id
     *
     * @param scanner
     * @return
     */
    public static int validateEmployeeId(Scanner scanner) {
        System.out.print("Enter Employee Id: ");
        if (scanner.hasNextInt()) {
            int employeeId = scanner.nextInt();
            if (employeeId != 0) {
                return employeeId;
            }
        }
        System.out.println("Invalid Input: Enter Employee ID");
        scanner.nextLine();
        return validateEmployeeId(scanner);
    }

    /**
     * validation for Employee name
     *
     * @param scanner
     * @return
     */
    public static String validateEmployeeName(Scanner scanner) {
        System.out.println("Enter your name: ");
        String n = scanner.nextLine();
        if (n == null || n.trim().isEmpty()) {
            return validateEmployeeName(scanner);
        }
        return n;
    }

    /**
     * validation for employee salary
     *
     * @param scanner
     * @return
     */
    public static double validateEmployeeSalary(Scanner scanner) {
        System.out.println("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        if (salary > 0) {
            return salary;
        }
        System.out.println("Enter valid Salary:");
//        scanner.nextDouble();
        return validateEmployeeSalary(scanner);
    }

    public static double calculateHRA(double salary) {
        return salary * 0.10;
    }

    /**
     * method for calculate TA
     *
     * @param salary
     * @return
     */
    public static double calculateTA(double salary) {
        return salary * 0.08;
    }

    /**
     * Method for calculate DA
     *
     * @param salary
     * @return
     */
    public static double calculateDA(double salary) {
        return salary * 0.09;
    }

    /**
     * Method for calculate PF
     *
     * @param salary
     * @return
     */
    public static double calculatePF(double salary) {
        return salary * 0.20;
    }

    /**
     * Method for calculate Gross Salary
     *
     * @param HRA
     * @param DA
     * @param TA
     * @param PF
     * @param salary
     * @return
     */
    public static double calculateGrossSalary(double HRA, double DA, double TA, double PF, double salary) {
        return HRA + DA + TA - PF + salary;
    }
}
