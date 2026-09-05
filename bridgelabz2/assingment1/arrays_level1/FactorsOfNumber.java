import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Step 2: Create array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Step 3: Find factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // If array is full, increase its size
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;

                    int[] temp = new int[maxFactor];

                    // Copy old elements
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Step 4: Display factors
        System.out.print("Factors of " + number + " are: ");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}