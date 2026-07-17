public class CoinChange {
    static int ChangeCoin(int[] coins,int amount) {
        int ans = solve(coins, amount);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }
    static int solve(int[] coins,int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        int mini = Integer.MAX_VALUE;
        for (int coin : coins) {
            int recursionAns = solve(coins, amount - coin);
            if(recursionAns != Integer.MAX_VALUE){
                int finalAns = recursionAns + 1;
                mini = Math.min(mini,finalAns);
            }
        }
        return mini;
    }
    static void main(String[] args) {
        int[] coins = {1,2,5};
        int ans = ChangeCoin(coins,11);
        System.out.println(ans);
    }
}
