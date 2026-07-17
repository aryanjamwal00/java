public class PartitionEqualSubsetSum {

    static boolean solve(int target,int[] nums,int index){
        //base case
        if(target == 0){
            return true;
        }
        if(target < 0){
            return false;
        }
        if(index >= nums.length){
            return false;
        }
        //include ka case
        boolean includeKaAns = solve(target - nums[index],nums,index+1);
        //exclude ka case
        boolean excludeKaAns = solve(target,nums,index+1);

        return includeKaAns || excludeKaAns;
    }
    static boolean partition(int[] nums){
        int sum = 0;
        for(int num:nums){
            sum += num;
        }

        if((sum & 1) == 1){
            return false;
        }

        int index = 0;
        int target = sum/2;

        boolean ans = solve(target,nums,index);
        return ans;
    }
    static void main(String[] args) {
        int[] nums = {1,2,3,5};
        boolean ans = partition(nums);
        System.out.println(ans);
    }
}
