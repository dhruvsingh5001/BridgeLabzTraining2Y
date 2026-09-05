import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // StringBuilder to store unique characters
        StringBuilder result = new StringBuilder();

        // HashSet to keep track of characters
        HashSet<Character> set = new HashSet<>();

        // Traverse each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character is not already present
            if (!set.contains(ch)) {
                result.append(ch);
                set.add(ch);
            }
        }

        System.out.println("String without duplicates: " + result);

        sc.close();
    }
}