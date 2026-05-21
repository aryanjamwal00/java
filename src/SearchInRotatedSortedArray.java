public class SearchInRotatedSortedArray {
    static int pivotIndex(int[] nums){
        int n= nums.length;
        int s=0;
        int e=n-1;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid] > nums[n-1]){
                ans=mid;
                s=mid+1;
            }else{
                //nums[mid] <= nums[n-1];
                e=mid-1;
            }
        }
        return ans;
    }
    static int binarySearch(int[] nums, int start, int end, int key){
        int n = nums.length;

        while(start<=end) {
            int mid = start + (end-start)/2;
            if (key == nums[mid]) {
                //return the index as key is found
                return mid;
            } else if (key < nums[mid]) {
                //we will check to the left side of mid
                end = mid - 1;
            } else {
                //key > nums[mid]
                //we will check to the right side of mid
                start = mid + 1;
            }
        }
        return -1;
    }
    static int search(int[] nums,int target){
        int pivotIndex=pivotIndex(nums);
        int n=nums.length;

        if(pivotIndex==-1){
            return binarySearch(nums,0,n-1,target);
        }
        else{
            int startArray1=0;
            int endArray1=pivotIndex;
            if(target>=nums[startArray1] && target<=nums[endArray1]){
                return binarySearch(nums,startArray1,endArray1,target);
            }

            int startArray2=pivotIndex+1;
            int endArray2=n-1;
            if(target >=nums[startArray2] && target<=nums[endArray2]){
                return binarySearch(nums,startArray2,endArray2,target);
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int[] arr={4,5,6,7,8,0,1,2};
        int ans = search(arr,0);
        System.out.println(ans);
    }
}
