import java.util.Scanner;

public class CompareStrings {

    // Method to compare strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {

        // Check length first
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using charAt()
        boolean charAtResult = compareUsingCharAt(str1, str2);

        // Compare using built-in equals()
        boolean equalsResult = str1.equals(str2);

        // Display results
        System.out.println("Result using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + equalsResult);

        // Check both results
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods give different results.");
        }

        sc.close();
    }
}