package string;

import java.util.Arrays;

public class Anagram {

    /**
     * Check if two string are an anagram
     * @param word
     * @param anagram
     * @return true if they are anagram.
     * @return false they are not anagram.
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
