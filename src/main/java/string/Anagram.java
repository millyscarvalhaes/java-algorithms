package string;

import java.util.Arrays;

public class Anagram {

    /**
     * Returns boolean to indicate if both words are anagram of each other.
     * @param word
     * @param anagram
     * @return True if words are an anagram, otherwise false.
     */
    public boolean solution(String word, String anagram){

        // If lengths are different, they can not be anagram.
        if(word.length() != anagram.length()){
            return false;
        }

        char[] charWord = word.toLowerCase().toCharArray();
        char[] charAnagram = anagram.toLowerCase().toCharArray();

        // order alphabetically
        Arrays.sort(charWord);
        Arrays.sort(charAnagram);

        // check if they are equal
        return new String(charWord).equals(new String(charAnagram));
    }

}
