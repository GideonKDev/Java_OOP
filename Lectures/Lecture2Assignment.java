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

public class Lecture2Assignment {
    public static void main(String[] args){
       // Scanner input = new Scanner(System.in);
        String Text = "Hello World. Yes Master";
        int num =  TextAnalyzer.countWord(Text);
        System.out.println("Words: "+num);
        int num2 = TextAnalyzer.countSentences(Text);
        System.out.println("Sentences: "+num2);

        int num3 = TextAnalyzer.countCharacters(Text);
        System.out.println("Characters: "+num3);

        int num4 = TextAnalyzer.countVowels(Text);
        System.out.println("Vowels: "+num4);
        
        int num5 = TextAnalyzer.countConsonants(Text);
        System.out.println("Consonants: "+num5);

    }
    
}
