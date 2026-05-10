public class KadaneAlgorithm {
    static int maxSubArray(int[] nums){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            //step 1: take sum
            sum += nums[i];
            //step 2: compare with maxSum
            maxSum = Math.max(sum, maxSum);
            //step 3: negate negative sum
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
    static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(nums);
        System.out.println("Sum of maxSubArray is : " + ans);
    }
}
