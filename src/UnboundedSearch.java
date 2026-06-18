class InfiniteArray{
private int[] arr;

public InfiniteArray(int[] nums){
this.arr=nums;
}
public int get(int index){
if(index >= arr.length) return Integer.MAX_VALUE;
return arr[index];
}
}

public class UnboundedSearch {
    static int unBoundSearch(InfiniteArray arr,int target){
        if(arr.get(0) == target) return 0;

        int i=1;
        while(arr.get(i) <= target){
            i = i * 2;
        }
        if(arr.get(i) > target){
            int s = i/2;
            int e = i;
            //normal binary search use kro
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr.get(mid) == target){
                    return mid;
                }
                if(arr.get(mid) > target){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 1. Create a standard sorted array
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 23, 29, 31, 37, 41};

        // 2. Pass it into your InfiniteArray wrapper
        InfiniteArray infiniteArr = new InfiniteArray(nums);

        // 3. Define the target element you want to search for
        int target = 76;

        // 4. Call your unbounded search method
        int ans = unBoundSearch(infiniteArr, target);

        // 5. Print the result
        if (ans != -1) {
            System.out.println("Element " + target + " found at index: " + ans);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
