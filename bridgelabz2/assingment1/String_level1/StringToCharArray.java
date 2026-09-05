import java.util.Scanner;

public class StringToCharArray {

    // User-defined method to return characters
    // without using toCharArray()
    public static char[] getCharacters(String text) {

        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        // Check length
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] userDefinedArray = getCharacters(text);

        // Built-in toCharArray() method
        char[] builtInArray = text.toCharArray();

        // Display user-defined array
        System.out.print("Characters using user-defined method: ");
        for (char ch : userDefinedArray) {
            System.out.print(ch + " ");
        }

        // Display built-in array
        System.out.print("\nCharacters using toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        // Compare both arrays
        boolean result = compareCharArrays(
                userDefinedArray,
                builtInArray
        );

        System.out.println("\nAre both arrays same? " + result);

        sc.close();
    }
}