package uncategorized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    private final PrimeNumber primeNumber = new PrimeNumber();

    @Test
    void shouldPass(){
        Assertions.assertTrue(primeNumber.isPrimeNumber(2));
        Assertions.assertTrue(primeNumber.isPrimeNumber(3));
        Assertions.assertTrue(primeNumber.isPrimeNumber(7));
    }

    @Test
    void shouldFail(){
        Assertions.assertFalse(primeNumber.isPrimeNumber(1));
        Assertions.assertFalse(primeNumber.isPrimeNumber(4));
    }

}
