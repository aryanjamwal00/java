public class CoinCountII {
    public static int solve(int amount,int[] coins,int index){
        //base case
        if(amount == 0){
            return 1;
        }
        if(amount < 0){
            return 0;
        }
        if(index >= coins.length){
            return 0;
        }

        //include case
        int includeAns = solve(amount-coins[index],coins,index);
        //exclude case
        int excludeAns = solve(amount,coins,index+1);
        int finalAns = includeAns + excludeAns;
        return finalAns;
    }
    public static int change(int amount, int[] coins) {
        int index = 0;
        int ans = solve(amount, coins, index);
        return ans;
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int ans = change(10,coins);
        System.out.println(ans);
    }
}
