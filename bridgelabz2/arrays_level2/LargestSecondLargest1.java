import java.util.Scanner;

public class LargestSecondLargest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store all digits in array
        while (number != 0) {

            // If array is full, increase its size by 10
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                // Copy old digits into temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign temp array to digits
                digits = temp;
            }

            // Get last digit
            int digit = number % 10;

            // Store digit
            digits[index] = digit;

            index++;

            // Remove last digit
            number = number / 10;
        }

        // Find largest and second largest
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display digits
        System.out.print("Digits in array: ");

        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}