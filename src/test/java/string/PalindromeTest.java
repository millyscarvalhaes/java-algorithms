package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    private final Palindrome palindrome = new Palindrome();

    @Test
    void shouldPass(){
        Assertions.assertEquals("edcba", palindrome.solution("abcde"));
        Assertions.assertEquals("54321", palindrome.solution("12345"));
    }

    @Test
    void shouldFail(){
        Assertions.assertNotEquals("acbde", palindrome.solution("acbde"));
        Assertions.assertNotEquals("12345", palindrome.solution("12345"));
    }

}
