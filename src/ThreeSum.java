import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        int n = nums.length;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        //yjs hum sort krenge taki koi same triplet alg form sa na aa jaye
                        Collections.sort(temp);
                        //yhsa hum apna triplets ko list mein add krenge
                        list.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = new ThreeSum().threeSum(nums);
        System.out.println(list);
    }
}