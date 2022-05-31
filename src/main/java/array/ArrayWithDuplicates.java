package array;

import java.util.HashMap;

/**
 * Write a function that given an array of integers, it return duplicates and the number of times it appears.
 *
 * Example 1
 * [1,2,3,4,6,6,7,8,9,5,2,6,1,8] #=> {1:2, 2:2, 6:3, 8:2}
 */

public class ArrayWithDuplicates {

    public static void main(String[] args) {
        ArrayWithDuplicates s = new ArrayWithDuplicates();
        System.out.println(s.duplicates(new int[]{1,2,3,4,6,6,7,8,9,5,2,6,1,8,4,4,5,5}));

    }

    public HashMap<Integer, Integer> duplicates(int[] A){

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num : A){

            int count = 0;
            for(int dup : A){
                if (num == dup){
                    count++;
                }
            }

            if(count>1){
                hashMap.put(num, count);
            }

        }
        return hashMap;
    }

}
