package uncategorized;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

    /**
     * Check if number is prime
     * @param number
     * @return true if number is prime, otherwise false
     */
    public boolean isPrimeNumber( int number){

        return number > 1 && IntStream
                .rangeClosed(2,(int) Math.sqrt(number))
                .noneMatch( n -> number % n == 0);
    }

}
