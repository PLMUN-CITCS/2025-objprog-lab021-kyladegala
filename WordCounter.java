import java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        
        // Return the entered sentence as a String
        return scanner.nextLine();
    }

    // Method to count the number of words in the given sentence
    public static int countWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.trim().split("\\s+");
        
        // Return the number of words
        return words.length;
    }

    // Main program flow
    public static void main(String[] args) {
        // Call the getSentenceInput() method to get the sentence from the user
        String sentence = getSentenceInput();

        // Pass the returned sentence to the countWords() method to calculate the word count
        int wordCount = countWords(sentence);

        // Display the word count to the user
        System.out.println("The sentence contains " + wordCount + " words.");
    } // <-- This closing brace was missing
}