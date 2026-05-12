import java.util.ArrayList;
import java.util.List;

public class ColumnSum2DArray {

        static List<Integer> rowSum(int[][] arr){
            List<Integer> list = new ArrayList<>();
            int n = arr.length;
            int m = arr[0].length;

            for(int j = 0;j < m;j++) {
                int sum = 0;
                for(int i = 0; i < n; i++) {
                    sum = sum + arr[i][j];
                }
                list.add(sum);
            }
            return list;
        }
        static void main(String[] args) {
            int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
            List<Integer> ans = rowSum(arr);
            System.out.println(ans);
        }
}
