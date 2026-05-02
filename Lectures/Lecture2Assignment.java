/*
Lab. Exercise 2: Text Analysis and Processing Tool
Scenario
A digital humanities researcher needs a tool to analyze text documents. The tool should process input text, identify patterns, count various elements, and perform text transformations.
Requirements
Part A: Basic Text Statistics
Create a class TextAnalyzer with the following methods:
•	countWords(String text): Returns the number of words in the text (words are sequences separated by whitespace or punctuation)
•	countSentences(String text): Returns the number of sentences (ending with ., !, or ?)
•	countCharacters(String text): Returns the total number of characters (excluding whitespace)
•	countVowels(String text): Returns the count of vowels (a, e, i, o, u - both cases)
•	countConsonants(String text): Returns the count of consonants
Part B: Word Frequency Analysis
Create a method wordFrequency(String text) that:
•	Splits the text into words (ignoring punctuation)
•	Converts all words to lowercase for case-insensitive counting
•	Returns a HashMap<String, Integer> mapping each word to its frequency
•	Displays the top 5 most frequent words
Part C: Text Transformation
Create methods that:
•	reverseWords(String text): Reverses the order of words in the text (not the characters)
•	toPigLatin(String text): Converts each word to Pig Latin:
o	If a word starts with a vowel, add "ay" to the end
o	If a word starts with a consonant, move the first consonant(s) to the end and add "ay"
•	removeDuplicates(String text): Removes duplicate words while preserving the first occurrence of each
Part D: Interactive Analysis Program
Write a main program that:
1.	Prompts the user to enter text or select a sample text
2.	Displays a menu of analysis options (using do-while loop)
3.	Allows the user to choose which analysis to perform
4.	Continues until the user chooses to exit

*/
import java.util.*;
public class Lecture2Assignment {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Kirui texts analyzer");
        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println("Choose an analysis option:");
        System.out.println("1. Basic Text Statistics");
        System.out.println("2. Word Frequency Analysis");
        System.out.println("3. Text Transformation");
        System.out.println("4. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Word Count: " + TextAnalyzer.countWord(text));
                    System.out.println("Sentence Count: " + TextAnalyzer.countSentences(text));
                    System.out.println("Character Count: " + TextAnalyzer.countCharacters(text));
                    System.out.println("Vowel Count: " + TextAnalyzer.countVowels(text));
                    System.out.println("Consonant Count: " + TextAnalyzer.countConsonants(text));
                    break;
                case 2:
                    TextAnalyzer.wordFrequency(text);
                    break;
                case 3:
                    System.out.println("Reversed Words: " + TextAnalyzer.reverseWords(text));
                    System.out.println("Pig Latin: " + TextAnalyzer.toPigLatin(text));
                    System.out.println("Removed Duplicates: " + TextAnalyzer.removeDuplicates(text));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
    
}
