package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayRightTest {

    private final RotateArrayRight rotateArrayRight = new RotateArrayRight();

    @Test
    void shouldPass(){

        Assertions.assertArrayEquals(new int[]{5,1,2,3,4}, rotateArrayRight.solution(new int[]{1,2,3,4,5},1));
        Assertions.assertArrayEquals(new int[]{4,5,1,2,3}, rotateArrayRight.solution(new int[]{1,2,3,4,5},2));
        Assertions.assertArrayEquals(new int[]{3,4,5,1,2}, rotateArrayRight.solution(new int[]{1,2,3,4,5},3));

        Assertions.assertArrayEquals(new int[]{}, rotateArrayRight.solution(new int[]{},3));

    }

}
