package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBracketsTest {

    private final BalancedBrackets brackets = new BalancedBrackets();

    @Test
    void shouldPass(){
        Assertions.assertTrue(brackets.solution("{[()]}"));
        Assertions.assertTrue(brackets.solution("{{[[(())]]}}"));
        Assertions.assertTrue(brackets.solution("{c{c[[((a)a)a]]}}"));}

    @Test
    void shouldNotPass(){
        Assertions.assertFalse(brackets.solution("{[(])}"));
    }



}