import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class TextAnalyzer {
    public static int countWord(String text){
        //Returns the number of words in the text 
        //(words are sequences separated by whitespace or punctuation)
        if (text ==null || text.trim().isEmpty()){
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;


    }

    public static int countSentences(String text){
        //Returns the number of sentences (ending with ., !, or ?)
        if (text == null){
            return 0;
        }

        String[] words = text.split("[.!?:]+");
        return words.length;

    }


    public static int countCharacters(String text){
        //Returns the total number of characters (excluding whitespace)
        if (text == null){
            return 0;
        }

        int count=0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)){
                count++;
            }
        }

        return count;        
    }

    public static int countVowels(String text){
        if (text == null){
            return 0;
        }
        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i<text.length(); i++){
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        return count;
    }

    public static int countConsonants(String text){
          if (text == null){
            return 0;
        }
        int count = 0;
        
        text = text.toLowerCase();
        for (int i = 0; i<text.length(); i++){
            
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                count++;
            }
        }

        return count;

    }

    public static void wordFrequency(String text){
        //         Part B: Word Frequency Analysis
        // Create a method wordFrequency(String text) that:
        // •	Splits the text into words (ignoring punctuation)
        // •	Converts all words to lowercase for case-insensitive counting
        // •	Returns a HashMap<String, Integer> mapping each word to its frequency
        // •	Displays the top 5 most frequent words

        String[] words = text.split("\\W+");
        words = words.toLowerCase();
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words){
            if (frequencyMap.containsKey(word)){
                frequencyMap.put(word, frequencyMap.get(word)+1);
            } else {
                frequencyMap.put(word, 1);
            }
        }
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, sortedEntries.size()); i++){
            Map.Entry<String, Integer> entry = sortedEntries.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        
    }

    public static String reverseWords(String text){
        if (text == null || text.isEmpty()){
            return null;
        }
        return new StringBuilder(text).reverse().toString();
    }

    public static String toPigLatinWord(String word){
        //code to convert a sentence to pig latin
        if (word == null || word.isEmpty()){
            return null;
        }
        word = word.toLowerCase();
        char c = word.charAt(0);

    //if the text starts with a vowel
         if (c == 'a' || c == 'e' ||c == 'i' || c == 'o' ||c == 'u' ){
            return word + "way";
         }else{
        return word.substring(1)+c+"ay";
    }
    //otherwise.. move leading constants to the en

    }

    public static String toPigLatin(String text){
        if (text== null || text.isEmpty()){
            return null;

        }

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String w: words){
            result.append(TextAnalyzer.toPigLatinWord(w)).append(" ");
        }

        return result.toString();
    }

    public static String removeDuplicates(String text){
        //code to remove duplicated words from a sentence
        if (text == null || text.isEmpty()){
            return null;
        }   
        
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        HashSet<String> seen = new HashSet<>();

        for (String m: words){
            if (!seen.contains(m.toLowerCase())) {
            seen.add(m.toLowerCase());
            result.append(m).append(" ");
        }
        }

        return result.toString().trim();
    }

}