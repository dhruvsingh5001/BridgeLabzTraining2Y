import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        String fileName = "example.txt";

        try {
            // Create FileReader
            FileReader fileReader = new FileReader(fileName);

            // Wrap FileReader with BufferedReader
            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}