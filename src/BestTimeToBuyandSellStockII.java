public class BestTimeToBuyandSellStockII {
    public static void main(String[] args) {
        int [] x = {7,1,5,3,6,4};
        System.out.println(maxProfit(x));

    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if(prices[i + 1] - prices[i] > 0){
                max += (prices[i + 1] - prices[i]);
            }
        }
        return max;
    }

}
