package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayLeftTest {

    private final RotateArrayLeft rotateArrayLeft = new RotateArrayLeft();

    @Test
    void shouldPass(){

        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 1}, rotateArrayLeft.solution(new int[]{1,2,3,4,5},1));
        Assertions.assertArrayEquals(new int[]{3,4,5,1,2}, rotateArrayLeft.solution(new int[]{1,2,3,4,5},2));
        Assertions.assertArrayEquals(new int[]{4,5,1,2,3}, rotateArrayLeft.solution(new int[]{1,2,3,4,5},3));

    }

}
