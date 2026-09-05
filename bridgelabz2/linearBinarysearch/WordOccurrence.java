import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter word to search: ");
        String targetWord = sc.nextLine();

        int count = 0;

        try {
            // Create FileReader
            FileReader fileReader = new FileReader(fileName);

            // Wrap FileReader with BufferedReader
            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            reader.close();

            // Display result
            System.out.println("The word '" + targetWord
                    + "' occurs " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}