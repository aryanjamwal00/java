public class MinimizeTheDifferenceBtwTargetAndElements {
    static int solve(int row,int sum,int[][] mat,int target){
        //base case
        if(row >= mat.length){
            //invalid row index
            //sum ready
            return Math.abs(target - sum);
        }
        int mini = Integer.MAX_VALUE;

        for(int num:mat[row]){
            int ans = solve(row+1,sum+num,mat,target);
            mini = Math.min(mini,ans);
            }
        return mini;
    }
    static int minimizeTheDifference(int[][] mat,int target){
        int row = 0;
        int sum = 0;
        int ans = solve(row,sum,mat,target);
        return ans;
    }
    static void main(String[] args) {
        int[][] mat = {{1,2,3}};
        int ans = minimizeTheDifference(mat,5);
        System.out.println(ans);
    }
}
