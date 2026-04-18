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
        //split the texts into words(ignoring punctuations)
        
    }
    

    }


