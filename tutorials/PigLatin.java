package Java_OOP.tutorials;

public class PigLatin {
    // Method to convert text to Pig Latin
    /*
    what is pig latin?
    Pig Latin is a playful language game where words are transformed according to specific rules.
    Rules:
1. If a word starts with a vowel (a, e, i, o, u), add "ay" to the end of the word.
   Example: "apple" becomes "appleay"
2. If a word starts with a consonant, move the first consonant(s) to the end of the word and add "ay".
   Example: "hello" becomes "ellohay"
    */
   public static String toPigLatin(String text){
    if (text.isEmpty()){
        return null;
    }
    text = text.toLowerCase();
    char c = text.charAt(0);

    //if the text starts with a vowel
    if (c == 'a' || c == 'e' ||c == 'i' || c == 'o' ||c == 'u' ){
        return text + "way";
    }else{
        return text.substring(1)+c+"ay";
    }
    //otherwise.. move leading constants to the end and ad "ay"
   }

   public static String sentenceToPigLatin(String sentence){
    if (sentence == null || sentence.isEmpty()){
        return null;
    }

    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();

    for(String w: words){
        result.append(toPigLatin(w)).append(" ");
    }

    return result.toString().trim();
    //.trim() is used to remove the trailing space at the end of the result string
   }

   public static void main(String[] args) {
       String ans=PigLatin.toPigLatin("rhythm");
       System.out.println(ans);

       String ans2= sentenceToPigLatin("Master apple will come home soon");
       System.out.println(ans2);
   }
}