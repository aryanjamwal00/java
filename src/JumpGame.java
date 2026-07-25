public class JumpGame {
    static boolean solve(int[] nums,int index){
        //base case
        if(index == nums.length-1){
            return true;
        }
        //destination sa bhr
        if(index >= nums.length-1){
            return false;
        }
        //stuck valla case
        if(nums[index] == 0){
            return false;
        }
        //1 case solve kro baki recursion smbhal lo
        boolean finalAns = false;
        int jumpValue = nums[index];

        for(int jump=1;jump<=jumpValue;jump++){
            boolean recAns = solve(nums,index+jump);
            finalAns = finalAns || recAns;
        }
        return finalAns;
    }
    static boolean canJump(int[] nums){
        int index = 0;
        return solve(nums,index);
    }
    static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        boolean ans = canJump(nums);
        System.out.println(ans);
    }
}
