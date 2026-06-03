public class EKOSPOJ {
    static boolean isValidAnswer(int[] trees,int m,int maxheight){
        long totalwoodCollected=0;

        for(int i=0;i<trees.length;i++){
            if(trees[i]>maxheight){
                long currentTreewoodCollected=trees[i]-maxheight;
                totalwoodCollected+=currentTreewoodCollected;
            }
        }
        if(totalwoodCollected>=m){
            return true;
        }
        return false;
    }
    static int maxSawHeight(int[] trees,int m){
        int n=trees.length;
        int s=0;
        int maxi=-1;

        for(int i=0;i<n;i++){
            if(trees[i]>maxi){
                maxi=trees[i];
            }
        }
        int e=maxi;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(isValidAnswer(trees,m,mid)){
                //potential ans so we store ans
                ans=mid;
                //after storing move right
                s=mid+1;
            }
            else{
                //not getting potential ans
                //moving left
                e=mid-1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        //int[] trees = {20,15,10,17};
        int ans=maxSawHeight(new int[]{20,15,10,17},7);
        System.out.println(ans);
    }
}
