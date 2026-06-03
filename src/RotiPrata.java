public class RotiPrata {
    static boolean isValidAnswer(int totalPratas,int[] cook,int totalCook,int timeLimit){
        int prataCount = 0;

        for(int i=0;i<cook.length;i++){
            int currentCookRank=cook[i];
            int timeTaken = 0;
            int j=1;

            while(timeTaken<=timeLimit){
                if(timeTaken + j*currentCookRank<=timeLimit){
                    //parata bnao
                    timeTaken += j*currentCookRank;
                    prataCount++;
                    j++;
                }
                else{
                    //iska mtlb current prata time ka andr ni bn skta
                    break;
                }
            }
            if(prataCount >= totalPratas){
                return true;
            }
        }
        if(prataCount >= totalPratas){
            return true;
        }
        else{
            return false;
        }
    }
    static int minTimeToCookParatas(int p,int[] cook,int n){
        //p->no of pratas
        //n->no of cooks
        int maxRank=-1;
        for(int i=0;i<cook.length;i++){
            if(cook[i] > maxRank){
                maxRank=cook[i];
            }
        }
        int s=0;
        //R*(n(n+1)/2)->R=maxRank n->no of pratas
        int e=maxRank*(p*(p+1)/2);
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(isValidAnswer(p,cook,n,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] cook={1,2,3,4};
        int ans=minTimeToCookParatas(10,cook,4);
        System.out.println(ans);
    }
}

