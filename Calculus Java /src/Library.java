import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Calculus operator = new Calculus("MathWonder.txt");

            // Test character count
            System.out.println("Character count:");
            System.out.println("Actual: " + operator.getNumCharacters());
            System.out.println("Expected: 170922");

            // Test first occurrences
            System.out.println("\nFirst occurrences:");
            System.out.println("Actual: " + operator.firstOccurrences());

            // Test first sentence
            System.out.println("\nFirst sentence:");
            System.out.println("Actual: " + operator.getFirstSentence());
            System.out.println("Expected: Introduce Calculus-Beginner The Calculus is awesome!");
        } catch (Exception e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}
