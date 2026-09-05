import java.util.Scanner;

public class InsertionSortEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] employeeIds = new int[n];

        // Take employee IDs as input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee ID " + (i + 1) + ": ");
            employeeIds[i] = sc.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {

            int key = employeeIds[i];
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            // Insert key at correct position
            employeeIds[j + 1] = key;
        }

        // Display sorted employee IDs
        System.out.println("\nEmployee IDs in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.print(employeeIds[i] + " ");
        }

        sc.close();
    }
}