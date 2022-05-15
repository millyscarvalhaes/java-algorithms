package string.uncategorized;

public class FrogJmp {
    /**
     * https://app.codility.com/demo/results/trainingCT8438-A5H/
     */
    public int solution(int X, int Y, int D){
        return (int)Math.ceil( ( ( double)Y -(double)X ) / (double)D );
    }

}
