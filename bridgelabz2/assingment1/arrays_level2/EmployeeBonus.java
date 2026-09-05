import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] employee = new double[10][2];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            // Validate input
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Enter again.");
                i--; // Repeat current employee
                continue;
            }

            employee[i][0] = salary;
            employee[i][1] = years;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            double salary = employee[i][0];
            double years = employee[i][1];

            if (years > 5) {
                bonus[i] = salary * 0.05;
            } else {
                bonus[i] = salary * 0.02;
            }

            newSalary[i] = salary + bonus[i];

            totalOldSalary += salary;
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display result
        System.out.println("\nEmployee Details:");
        System.out.println("---------------------------------------------");
        System.out.println("Employee\tOld Salary\tBonus\tNew Salary");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t%.2f%n",
                    i + 1,
                    employee[i][0],
                    bonus[i],
                    newSalary[i]);
        }

        System.out.println("---------------------------------------------");
        System.out.printf("Total Old Salary : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus      : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNewSalary);

        sc.close();
    }
}