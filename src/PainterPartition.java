public class PainterPartition {
    static boolean validAnswer(int[] boards,int k,int maxlength){
        int painterCount=1;
        int paintedLength=0;

        for(int i=0;i<boards.length;i++){
            if((paintedLength+boards[i])<=maxlength){
                paintedLength+=boards[i];
            }
            else{
                //paintedlength+boards[i]>maxlengh
                painterCount++;
                paintedLength=0;
                if(painterCount>k || boards[i]>maxlength){
                    return false;
                }
                else{
                    paintedLength=boards[i];
                }
            }
        }
        return true;
    }
    static int minTime(int[] boards,int k){
        int sum=0;
        for(int i=0;i<boards.length;i++){
            sum+=boards[i];
        }

        int s=0;
        int e=sum;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(validAnswer(boards,k,mid)){
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
        int[] boards={5,10,30,20,15};
        int ans=minTime(boards,3);
        System.out.println(ans);
    }
}
