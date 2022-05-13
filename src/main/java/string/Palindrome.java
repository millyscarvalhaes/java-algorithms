package string;

public class Palindrome {

    /**
     * Return a palindrome of given string.
     * @param word
     * @return Palindrome string.
     */
    public String solution(String word){

        // Create string builder
        StringBuilder str = new StringBuilder(word);

        // return reversed string
        return str.reverse().toString();
    }

}
