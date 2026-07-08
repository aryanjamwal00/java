import     java.util.Arrays;
import java.util.WeakHashMap;

public class RotateImage {
    static void rotate90degreeClockwise(int[][] matrix,int N){
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                //swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<N;i++){
            int start = 0;
            int end = N-1;

            while(start<=end){
                //swap
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }

    }
    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate90degreeClockwise(matrix,3);
        System.out.println(Arrays.deepToString(matrix));
    }
}
