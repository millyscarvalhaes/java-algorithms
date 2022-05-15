package array;

import java.util.Arrays;

public class PermMissingElem {

    /**
     * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
     */
    public int solution(int[] A){

        // Empty
        if(A.length <= 0){
            return 1;
        }

        Arrays.sort(A);
        int N = 1;
        for(int i = 0; i < A.length ; i++){

            // missing element
            if(A[i] != N){
                return N;
            }

            // end of array
            if(i == A.length-1){
                return N + 1;
            }
            N++;

        }

        return -1;
    }
}
