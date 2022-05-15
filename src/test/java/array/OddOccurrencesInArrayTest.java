package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddOccurrencesInArrayTest {

    private final OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    void shouldPass(){

        Assertions.assertEquals(7, oddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9}));

    }

}
