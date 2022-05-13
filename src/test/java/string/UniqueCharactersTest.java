package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueCharactersTest {

    private final UniqueCharacters uniqueCharacters = new UniqueCharacters();

    @Test
    void shouldPass(){
        Assertions.assertTrue(uniqueCharacters.solution("abcde"));
        Assertions.assertTrue(uniqueCharacters.solution("12345"));
    }

    @Test
    void shouldFail(){
        Assertions.assertFalse(uniqueCharacters.solution("abcdee"));
        Assertions.assertFalse(uniqueCharacters.solution("123455"));
    }

}
