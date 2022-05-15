package array;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution( int[] A){

        // O(n log(n))
        Arrays.sort(A);

        /**
         * Since the array is ordered, compare each pair.
         * If the elements are different, return first element;
         * If reaches last element, return it;
         * O(n)
         */
        for (int i = 0; i < A.length ; i = i +2) {

            // Return last element
            if(i == A.length-1)
                return A[i];

            if(A[i] != A[i+1]){
                return A[i];
            }
        }

        return -1;

    }

}
