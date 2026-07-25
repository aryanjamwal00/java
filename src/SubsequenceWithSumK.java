public class SubsequenceWithSumK {
    static boolean solve(int[] arr,int k,int sum,int index){
        //base case
        if(index >= arr.length){
            //subsequence ready hai
            //or ye subs hum sum wale variable me track krre the
            //iska mtlb check sum
            if(sum == k)
                return true;
            else
                return false;
        }
        //1 case hum solve krenge baki recusion smbhal lega
        //include exclude pattern lgega
        int currentValue = arr[index];
        //exclude ka case
        boolean excludeKaAns = solve(arr,k,sum,index+1);
        //include ka case
        boolean includeKaAns = solve(arr,k,sum+currentValue,index+1);
        //dono mein se khi sa bi true aya , return true
        //-> OR operator ka behaviour
        boolean finalAns = includeKaAns || excludeKaAns;
        return finalAns;
    }
    static boolean checkSubsequenceSum(int[] arr,int k){
        int index = 0;
        int sum = 0;
        boolean ans = solve(arr,k,sum,index);
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        boolean ans = checkSubsequenceSum(arr,8);
        System.out.println(ans);
    }
}
