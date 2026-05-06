public class BuyAndSellStocks {
    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int price : prices) {
            //update minPrice
            minPrice = Math.min(minPrice, price);
            //calculate daily profit
            int dailyProfit = price - minPrice;
            //calculate maxprofit
            maxProfit = Math.max(maxProfit, dailyProfit);
        }
        return maxProfit;
    }
    static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
