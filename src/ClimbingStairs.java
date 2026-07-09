public class ClimbingStairs {
    static int ClimbStairs(int n){
        //base case
        //basic approach
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        int ans = ClimbStairs(n-1) + ClimbStairs(n-2);
        return ans;
    }
    static void main(String[] args) {
        int ans = ClimbStairs(32);
        System.out.println("Mininmum Steps required to climb a Stair is:" +ans);
    }
}
