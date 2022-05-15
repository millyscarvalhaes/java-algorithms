package array;

public class RotateArrayRight {

    public int[] solution(int[] A, int k){

        for (int i = 0; i < k; i++) {

            int last = A[A.length-1];
            for (int j = A.length-1; j > 0 ; j--) {
                A[j] = A[j-1];
            }
            A[0] = last;
        }
        return A;
    }

}
