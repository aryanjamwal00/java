import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumber {

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        //marking
        int n = nums.length;
        for (int index = 0; index < n; index++){
            int value = Math.abs(nums[index]);
            int position = value - 1;
            //mark krdo ye postion
            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
        }
        //travel array if found any positive number print that number
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                int valueAtIndex = i+1;
                ans.add(valueAtIndex);
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
