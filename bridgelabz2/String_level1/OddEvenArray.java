import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check natural number
        if (number < 1) {
            System.out.println("Error: Please enter a natural number.");
            return;
        }

        // Step 2: Create arrays
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        // Step 3: Index variables
        int oddIndex = 0;
        int evenIndex = 0;

        // Step 4: Store odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Step 5: Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        input.close();
    }
}