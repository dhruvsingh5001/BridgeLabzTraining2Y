import java.util.Scanner;

public class SubstringComparison {

    // Create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring using charAt()
        String substringCharAt =
                createSubstringUsingCharAt(text, start, end);

        // Create substring using built-in substring()
        String substringBuiltIn = text.substring(start, end);

        // Display substrings
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringBuiltIn);

        // Compare both strings
        boolean result = compareUsingCharAt(
                substringCharAt,
                substringBuiltIn
        );

        System.out.println("Are both substrings same? " + result);

        sc.close();
    }
}