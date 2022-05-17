package uncategorized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrogJmpTest {

    private  final FrogJmp frogJmp = new FrogJmp();

    @Test
    void shouldPass(){

        Assertions.assertEquals(3, frogJmp.solution(10,85,30));
        Assertions.assertEquals(34, frogJmp.solution(5,105,3));
        Assertions.assertEquals(142730189, frogJmp.solution(3,999111321,7));

    }

}
