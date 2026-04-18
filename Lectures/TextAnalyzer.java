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

    public static int countSentences(){

    }

    // public static int countCharacters(){

    // }

    // public static int countVowels(){

    // }

    // public static int countConsonants(){

    // }




}
