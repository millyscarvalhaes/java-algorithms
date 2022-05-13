package string;

import java.util.Arrays;

public class Anagram {

    /**
     * Compare strings size, if they are equal order alphabetically and compare results.
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

        Arrays.sort(charWord);
        Arrays.sort(charAnagram);

        return new String(charWord).equals(new String(charAnagram));
    }

}
