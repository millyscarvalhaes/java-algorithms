package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TapeEquilibrium {

    /**
     * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
     */
    public int solution(int[] A){

        //Sum all elements of array
        //int sum = Arrays.stream(A).sum();

        int sum = 0;
        for (int a : A) {
            sum += a;
        }

        // Max value in range
        int min = 100000;

        // Use that sum as an incremental SUM
        int leftSum = 0;

        // loop through parts
        for (int p = 1; p < A.length; p++) {

            // sum elements at left part
            leftSum += A[p-1];

            // remove leftSum from total sum.
            int rightSum = sum - leftSum;

            // calc abd diff between parts
            int diff = Math.abs(leftSum - rightSum);

            // check if is the min sum
            if(diff < min) {
                min = diff;
            }

        }

        return min;

//        int n = A.length;
//        int s = 0;
//
//        for (int a : A) {
//            s += a;
//        }
//
//        int r = 100000;
//        int s1 = 0;
//        for (int p = 1; p < n; p++) {
//            s1 += A[p - 1];
//            int s2 = s - s1;
//            int t = Math.abs(s1 - s2);
//            if (t < r) {
//                r = t;
//            }
//        }
//        return r;

//        int minSum = 999999999;
//
//        // Splits
//        for (int p = 1; p < A.length; p++) {
//
//            int leftSum = 0;
//            for(int left = 0; left < p; left ++){
//                leftSum += A[left];
//            }
//
//            int rightSum = 0;
//            for(int right = p; right < A.length; right++){
//                rightSum += A[right];
//            }
//
//            int diff = Math.abs(leftSum - rightSum);
//
//            if(diff < minSum){
//                minSum = diff;
//            }
//
//        }
//
//        return minSum;
    }

}
