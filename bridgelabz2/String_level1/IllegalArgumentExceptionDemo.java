import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {

        int start = 4;
        int end = 2;

        if (start > end) {
            throw new IllegalArgumentException(
                    "Start index cannot be greater than end index."
            );
        }

        System.out.println(text.substring(start, end));
    }

    // Method to handle the exception
    public static void handleException(String text) {

        int start = 4;
        int end = 2;

        try {
            if (start > end) {
                throw new IllegalArgumentException(
                        "Start index cannot be greater than end index."
                );
            }

            System.out.println(text.substring(start, end));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled.");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled.");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // First call: Generate exception
        // Uncomment to demonstrate exception generation
        // generateException(text);

        // Second call: Handle exception
        handleException(text);

        sc.close();
    }
}