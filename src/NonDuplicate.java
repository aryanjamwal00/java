public class NonDuplicate {
    static int singleNonDuplicate(int[] nums){
        int n=nums.length;

        int s=0;
        int e=n;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(s==e){
                return nums[s];
            }

            int currentValue=nums[mid];
            int preValue=-1;
            if(mid-1 > 0){
                preValue=nums[mid-1];
            }

            int nextValue=-1;
            if(mid+1 < n){
                nextValue=nums[mid+1];
            }

            if(currentValue!=preValue && currentValue!=nextValue){
                return currentValue;
            }
            if(currentValue!=preValue && currentValue==nextValue){
                int startingIndexOfPair=mid;
                if((startingIndexOfPair & 1)==1){
                    //starting index odd
                    //move left
                    e=mid-1;
                }
                else{
                    //move right
                    s=mid+1;
                }
            }
            if(currentValue==preValue && currentValue!=nextValue){
                int endingIndexOfPair=mid;
                if((endingIndexOfPair & 1)==1){
                    //odd index
                    //move right
                    s=mid+1;
                }
                else{
                    //move left
                    e=mid-1;
                }
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,9,9,10,10};
        int ans=singleNonDuplicate(nums);
        System.out.println("Non Duplicate Element in an Array is:" +ans);
    }
}
