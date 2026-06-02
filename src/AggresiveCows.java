import java.util.Arrays;

public class AggresiveCows {
    static boolean isvalidAnswer(int[] stalls,int k,int minDistance){
        //brute force
        int cowCount=1;
        //first cow is placed at 0 index
        int lastPosition=0;

        for(int i=1;i<stalls.length;i++){
            //current cow ko current position pa tb hi aaigi jab
            //current aur prev cows ka bech ka distance>=mindsitance ho
            if(stalls[i]-stalls[lastPosition]>=minDistance){
                //can place safely
                cowCount++;
                //new cow placed now update last postion
                lastPosition=i;
                if(cowCount==k){
                    return true;
                    //all cows placed
                }
            }
        }
        return false;
    }
    static int agressiveCows(int[] stalls,int k){
        Arrays.sort(stalls);
        int n=stalls.length;

        int start=0;
        int end=stalls[n-1]-stalls[0];
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(isvalidAnswer(stalls,k,mid)){
                //got a possible solution
                //store ans
                //move to right
                ans=mid;
                start=mid+1;
            }
            else{
                //ans not found
                //move to left
                end=mid-1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] stalls={1,2,8,4,9};
        int ans=agressiveCows(stalls,3);
        System.out.println(ans);
    }
}
