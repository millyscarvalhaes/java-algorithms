package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermMissingElemTest {

    private PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    void shouldPass(){
        Assertions.assertEquals(4, permMissingElem.solution(new int[]{2,3,1,5}));
        Assertions.assertEquals(1, permMissingElem.solution(new int[]{2,3,4,5}));
        Assertions.assertEquals(1, permMissingElem.solution(new int[]{2}));
        Assertions.assertEquals(1, permMissingElem.solution(new int[]{5}));
        Assertions.assertEquals(5, permMissingElem.solution(new int[]{1,2,3,4}));
    }
}
