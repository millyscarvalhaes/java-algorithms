package array;

public class RotateArrayLeft {

    public int[] solution(int[] A, int k){


        for (int i = 0; i < k; i++){

            int first = A[0];

            // rotate all elements one by one to left
            for(int j = 0; j < A.length - 1; j ++){
                A[j] = A[j+1];
            }

            // place first element at last position
            A[A.length-1] = first;
        }

        return A;

    }

}
