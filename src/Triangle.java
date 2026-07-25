import java.util.List;

public class Triangle {
    static int solve(List<List<Integer>> Triangle,int rowIndex,int colIndex){
        //base case
        if(rowIndex == Triangle.size()-1){
            return Triangle.get(rowIndex).get(colIndex);
        }

        int downAns = solve(Triangle,rowIndex+1,colIndex);
        int diagonalAns = solve(Triangle,rowIndex+1,colIndex+1);
        int finalAns = Triangle.get(rowIndex).get(colIndex) + Math.min(downAns,diagonalAns);
        return finalAns;
    }
    static int minimumTotal(List<List<Integer>> Triangle){
        int rowIndex = 0;
        int colIndex = 0;
        int ans = solve(Triangle,rowIndex,colIndex);
        return ans;
    }

    static void main(String[] args) {
        List<List<Integer>> Triangle = List.of(
                List.of(2),
                List.of(3,4),
                List.of(6,5,7),
                List.of(4,1,8,3));
        int ans = minimumTotal(Triangle);
        System.out.println(ans);
    }
}
