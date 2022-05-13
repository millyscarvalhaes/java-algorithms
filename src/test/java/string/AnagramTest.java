package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {

    private final Anagram anagram = new Anagram();

    @Test
    void shouldReturnTrue(){
        Assertions.assertEquals(true, anagram.solution("ana", "naa"));
        Assertions.assertEquals(true, anagram.solution("qwertyuiop", "poiuytrewq"));
        Assertions.assertEquals(true, anagram.solution("789456123", "123654789"));
    }

    @Test
    void shouldReturnFalse(){
        Assertions.assertEquals(false, anagram.solution("ana", "naaq"));
        Assertions.assertEquals(false, anagram.solution("qwertyuio1", "poiuytrewq"));
        Assertions.assertEquals(false, anagram.solution("78945612a", "123654789"));
    }

}
