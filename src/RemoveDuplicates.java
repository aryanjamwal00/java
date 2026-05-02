public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                //no match
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    static void main() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k=removeDuplicates(nums);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
