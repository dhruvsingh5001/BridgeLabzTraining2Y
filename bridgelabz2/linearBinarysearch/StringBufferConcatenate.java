import java.util.Scanner;

public class StringBufferConcatenate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strings = new String[n];

        // Take input
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        // Create StringBuffer
        StringBuffer result = new StringBuffer();

        // Append each string
        for (int i = 0; i < n; i++) {
            result.append(strings[i]);
        }

        // Display concatenated string
        System.out.println("Concatenated String: " + result);

        sc.close();
    }
}