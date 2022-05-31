package uncategorized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    private final PrimeNumber primeNumber = new PrimeNumber();

    @Test
    void shouldPass(){
        Assertions.assertTrue(primeNumber.isPrimeNumberWithFor(2));
        Assertions.assertTrue(primeNumber.isPrimeNumberWithFor(3));
        Assertions.assertTrue(primeNumber.isPrimeNumberWithFor(7));
        Assertions.assertTrue(primeNumber.isPrimeNumberWithFor(13));
    }

    @Test
    void shouldFail(){
        Assertions.assertFalse(primeNumber.isPrimeNumberWithFor(1));
        Assertions.assertFalse(primeNumber.isPrimeNumberWithFor(4));
        Assertions.assertFalse(primeNumber.isPrimeNumberWithFor(15));
        Assertions.assertFalse(primeNumber.isPrimeNumberWithFor(21));
        Assertions.assertFalse(primeNumber.isPrimeNumberWithFor(77));
        Assertions.assertFalse(primeNumber.isPrimeNumberWithFor(9));
        Assertions.assertFalse(primeNumber.isPrimeNumberWithFor(25));
    }

}
