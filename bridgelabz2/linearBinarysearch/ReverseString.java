import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append the string
        sb.append(str);

        // Reverse the string
        sb.reverse();

        // Convert StringBuilder to String
        String reversedString = sb.toString();

        System.out.println("Reversed String: " + reversedString);

        sc.close();
    }
}