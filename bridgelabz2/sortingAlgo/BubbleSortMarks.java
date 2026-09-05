import java.util.Scanner;

public class BubbleSortMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Take marks input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent elements
                if (marks[j] > marks[j + 1]) {
                    // Swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop if no swapping happened
            if (!swapped) {
                break;
            }
        }

        // Display sorted marks
        System.out.println("\nMarks in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}