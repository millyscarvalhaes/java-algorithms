package uncategorized;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

    /**
     * A prime number is a natural number greater than 1, which is only divisible by 1 and itself.
     */

    public boolean isPrimeNumberWithFor(int number){

        // less or equal to one
        if( number <= 1) {
            return false;
        }

        // check from 2 to n-1
        for (int i = 2; i < number ; i++) {
            if( number % i == 0){
                return false;
            }
        }

        return true;
    }

    /**
     * Check if number is prime
     * @param number
     * @return true if number is prime, otherwise false
     */
    public boolean isPrimeNumber( int number){
        return number > 1 && IntStream.rangeClosed(2,(int) Math.sqrt(number)).noneMatch( n -> number % n == 0);

    }

}
