public class BankRobber {
    static int solve(int[] nums,int index){
        //base case
        if(index >= nums.length){
            return 0;
        }
        //mein index valle house pe hu
        //mere pass 2 choice hai
        //include case
        int includeAns = nums[index] + solve(nums,index+2);
        //exclude case
        int excludeAns = 0 + solve(nums,index+1);
        int finalAns = Math.max(includeAns,excludeAns);
        return finalAns;
    }
    static int rob(int[] nums){
        int index = 0;
        int ans = solve(nums,index);
        return ans;
    }
    static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int ans = rob(nums);
        System.out.println(ans);
    }
}
