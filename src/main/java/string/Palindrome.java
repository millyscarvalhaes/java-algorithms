package string;

public class Palindrome {

    /**
     * Return a palindrome of given string.
     * @param word
     * @return Palindrome string.
     */
    public String solution(String word){

        // return reversed string
        return new StringBuilder(word).reverse().toString();
    }

}
