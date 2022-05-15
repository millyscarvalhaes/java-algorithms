package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TapeEquilibriumTest {

    private final TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    void shouldPass(){
        Assertions.assertEquals(1, tapeEquilibrium.solution(new int[]{3,1,2,4,3}));
    }
}
