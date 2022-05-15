package string;

public class Palindrome {

    /**
     * Returns a palindrome of a given string.
     * @param word
     * @return Palindrome string.
     */
    public String solution(String word){

        // return reversed string
        return new StringBuilder(word).reverse().toString();
    }

}
