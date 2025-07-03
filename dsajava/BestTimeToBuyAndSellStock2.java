package dsajava;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock2 obj = new BestTimeToBuyAndSellStock2();
        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
