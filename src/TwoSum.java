import java.util.Arrays;

public class TwoSum {
    static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int ans[] = {arr[i],arr[j]};//agr index chaiye tho i+j only
                    return ans;
                }
            }
        }
        int ans[]={};
        return ans;

    }

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int ans[] = twoSum(arr, 11);
        System.out.println(Arrays.toString(ans));

    }
}

