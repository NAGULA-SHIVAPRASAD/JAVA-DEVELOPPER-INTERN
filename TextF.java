import java.io.*;
import java.util.Scanner;

public class TextF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        int lC = 0;
        int WC = 0;
        int chC = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lC++; // count lines
                chC += line.length(); // count characters (excluding newline)
                String[] words = line.trim().split("\\s+"); // split by whitespace
                if (!line.trim().isEmpty()) {
                    WC += words.length; // count words
                }
            }

            System.out.println("\nFile Analysis Results:");
            System.out.println("Lines: " + lC);
            System.out.println("Words: " + WC);
            System.out.println("Characters: " + chC);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            return;
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return;
        }

        // Search for a specific word in the file
        System.out.print("\nEnter a word to search: ");
        String searchWord = scanner.nextLine();
        int occurrences = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        occurrences++;
                    }
                }
            }

            if (occurrences > 0) {
                System.out.println("The word \"" + searchWord + "\" appears " + occurrences + " times.");
            } else {
                System.out.println("The word \"" + searchWord + "\" was not found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading the file for search.");
        }

        scanner.close();
    }
}
